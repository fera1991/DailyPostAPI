package com.squad8.dailypost.services.implementations;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.squad8.dailypost.models.dtos.SaveCommentDTO;
import com.squad8.dailypost.models.entities.Comment;
import com.squad8.dailypost.models.entities.Post;
import com.squad8.dailypost.repositories.CommentRepository;
import com.squad8.dailypost.services.CommentService;

import jakarta.transaction.Transactional;

public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentRepository commentRepository;

	@Override
	@Transactional(rollbackOn = Exception.class)
	public void save(SaveCommentDTO info, Post post) throws Exception {
		
		Comment comment = new Comment(post, info.getText());
		commentRepository.save(comment);
	}

	@Override
	@Transactional(rollbackOn = Exception.class)
	public void deleteById(String id) throws Exception {
		UUID code = UUID.fromString(id);
		commentRepository.deleteById(code);
	}
	

}
