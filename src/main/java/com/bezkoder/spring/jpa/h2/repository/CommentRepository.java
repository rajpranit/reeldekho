package com.bezkoder.spring.jpa.h2.repository;

import com.bezkoder.spring.jpa.h2.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommentRepository extends JpaRepository<Comment, UUID> {
}
