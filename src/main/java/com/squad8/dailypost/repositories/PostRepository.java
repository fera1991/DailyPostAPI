package com.squad8.dailypost.repositories;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

import com.squad8.dailypost.models.entities.Post;

public interface PostRepository extends ListCrudRepository<Post, UUID> {

}
