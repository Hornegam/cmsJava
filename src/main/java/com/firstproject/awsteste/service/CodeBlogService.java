package com.firstproject.awsteste.service;

import java.util.List;

import com.firstproject.awsteste.model.Post;


public interface CodeBlogService {

	List<Post> findAll();
	
	Post findById(long id);
	
	Post save(Post post);
	
}
