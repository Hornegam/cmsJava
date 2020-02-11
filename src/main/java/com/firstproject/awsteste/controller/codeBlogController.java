package com.firstproject.awsteste.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.firstproject.awsteste.model.Post;
import com.firstproject.awsteste.service.CodeBlogService;

@Controller
public class codeBlogController {

	@Autowired
	CodeBlogService codeService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public @ResponseBody ModelAndView getPosts() {
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = codeService.findAll();
		mv.addObject("posts", posts);

		return mv;
	}
}
