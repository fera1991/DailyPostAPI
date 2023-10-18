package com.squad8.dailypost.services;

import com.squad8.dailypost.models.dtos.SaveCommentDTO;
import com.squad8.dailypost.models.entities.Post;

public interface CommentService {
	void save(SaveCommentDTO info, Post post) throws Exception;
	void deleteById(String id) throws Exception;

}
