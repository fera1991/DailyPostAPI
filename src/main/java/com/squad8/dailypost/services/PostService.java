package com.squad8.dailypost.services;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;


import com.squad8.dailypost.models.entities.Post;

import jakarta.validation.Valid;

public interface PostService {
	void save(SavePostDTO info) throws Exception;
	Post findOneById(String id);
	Post findOneByTitle(String title);
	List<Post> findAll();
	Page<Post> findAll(int page, int size);
	void update(Post post, @Valid SavePostDTO info) throws Exception;
}
