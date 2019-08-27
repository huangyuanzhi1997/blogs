package com.huang.spring.boot.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huang.spring.boot.blog.domain.Vote;
import com.huang.spring.boot.blog.repository.VoteRepository;

/**
 * Vote 服务.
 *@author	黄远志
 *@date		2019年8月2日
 *@Blog		https://www.huangyuanzhi.top
 *@GitHub	https://github.com/huangyuanzhi1997
 */
@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteRepository voteRepository;
	
	@Override
	@Transactional
	public void removeVote(Long id) {
		voteRepository.delete(id);
	}
	
	@Override
	public Vote getVoteById(Long id) {
		return voteRepository.findOne(id);
	}

}
