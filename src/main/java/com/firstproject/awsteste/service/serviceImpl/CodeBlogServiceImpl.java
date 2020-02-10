package com.firstproject.awsteste.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject.awsteste.model.Post;
import com.firstproject.awsteste.repository.CodeBlogRepository;
import com.firstproject.awsteste.service.CodeBlogService;

@Service
public class CodeBlogServiceImpl implements CodeBlogService {

	@Autowired
	CodeBlogRepository codeblogRepository;
	
	
	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return codeblogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		// TODO Auto-generated method stub
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return codeblogRepository.save(post);
	}
	

}
