package com.bezkoder.spring.jpa.h2.repository;


import com.bezkoder.spring.jpa.h2.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
}
