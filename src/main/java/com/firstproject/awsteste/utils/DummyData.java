package com.firstproject.awsteste.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstproject.awsteste.model.Post;
import com.firstproject.awsteste.repository.CodeBlogRepository;

@Component
public class DummyData {

	@Autowired
	CodeBlogRepository codeblogRepository;
	
	//@PostConstruct
	public void savePosts() {
		List<Post> postList = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setAutor("Jesus de Miracéia");
		post1.setTexto("Mussum Ipsum, cacilds vidis litro abertis. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. Aenean aliquam molestie leo, vitae iaculis nisl. Casamentiss faiz malandris se pirulitá. Manduma pindureta quium dia nois paga.\r\n" + 
				"\r\n" + 
				"Nullam volutpat risus nec leo commodo, ut interdum diam laoreet. Sed non consequat odio. A ordem dos tratores não altera o pão duris. Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget. Atirei o pau no gatis, per gatis num morreus.");
		post1.setTitulo("Vala mi deusa");
		post1.setData(LocalDate.now());
		
		Post post2 = new Post();
		post2.setAutor("Jesus de Belem");
		post2.setTexto("Mussum Ipsum, cacilds vidis litro abertis. Vehicula non. Ut sed ex eros. Vivamus sit amet nibh non tellus tristique interdum. Aenean aliquam molestie leo, vitae iaculis nisl. Casamentiss faiz malandris se pirulitá. Manduma pindureta quium dia nois paga.\r\n" + 
				"\r\n" + 
				"Nullam volutpat risus nec leo commodo, ut interdum diam laoreet. Sed non consequat odio. A ordem dos tratores não altera o pão duris. Praesent vel viverra nisi. Mauris aliquet nunc non turpis scelerisque, eget. Atirei o pau no gatis, per gatis num morreus.");
		post2.setTitulo("Vala mi deuso");
		post2.setData(LocalDate.now());
		
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}
}
