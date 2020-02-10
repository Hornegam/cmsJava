package com.firstproject.awsteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstproject.awsteste.model.Post;

public interface CodeBlogRepository extends JpaRepository<Post, Long>{

}
