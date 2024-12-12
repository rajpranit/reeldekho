package com.bezkoder.spring.jpa.h2.service;

import com.bezkoder.spring.jpa.h2.entity.Comment;
import com.bezkoder.spring.jpa.h2.entity.EngagementMetrics;
import com.bezkoder.spring.jpa.h2.entity.Post;
import com.bezkoder.spring.jpa.h2.repository.CommentRepository;
import com.bezkoder.spring.jpa.h2.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public PostService(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public Post createPost(Post post) {
        post.setEngagementMetrics(new EngagementMetrics(0,0,0)); // Initialize metrics
        return postRepository.save(post);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(UUID id) {
        return postRepository.findById(id);
    }

    public Post updatePost(UUID id, Post updatedPost) {
        return postRepository.findById(id).map(post -> {
            post.setTitle(updatedPost.getTitle());
            post.setContent(updatedPost.getContent());
            post.setCategory(updatedPost.getCategory());
            return postRepository.save(post);
        }).orElseThrow(() -> new RuntimeException("Post not found"));
    }

    public void deletePost(UUID id) {
        postRepository.deleteById(id);
    }

    public Comment addComment(UUID postId, Comment comment) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found"));
        comment.setPost(post);
        return commentRepository.save(comment);
    }

    public void likePost(UUID postId) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found"));
        post.getEngagementMetrics().setLikes(post.getEngagementMetrics().getLikes() + 1);
        postRepository.save(post);
    }
}
