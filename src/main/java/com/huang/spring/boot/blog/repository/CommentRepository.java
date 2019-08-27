package com.huang.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huang.spring.boot.blog.domain.Comment;

/**
 * Comment 仓库.
 */
public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
