package com.huang.spring.boot.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huang.spring.boot.blog.domain.Comment;
import com.huang.spring.boot.blog.repository.CommentRepository;

/**
 * Comment 服务.
 *@author	黄远志
 *@date		2019年7月30日
 *@Blog		https://www.huangyuanzhi.top
 *@GitHub	https://github.com/huangyuanzhi1997
 */
@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	@Transactional
	public void removeComment(Long id) {
		commentRepository.delete(id);
	}
	@Override
	public Comment getCommentById(Long id) {
		return commentRepository.findOne(id);
	}

}
