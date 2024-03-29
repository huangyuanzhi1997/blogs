package com.huang.spring.boot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huang.spring.boot.blog.domain.Vote;

/**
 * Vote 仓库.
 *
 */
public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}
