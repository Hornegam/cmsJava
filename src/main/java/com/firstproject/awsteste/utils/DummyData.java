package com.firstproject.awsteste.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstproject.awsteste.model.Post;
import com.firstproject.awsteste.model.Usuario;
import com.firstproject.awsteste.repository.CodeBlogRepository;
import com.firstproject.awsteste.repository.UserRepository;

@Component
public class DummyData {

	
	/* CodeBlogRepository codeblogRepository; */
	@Autowired
	UserRepository user;
	
	@PostConstruct
	public void saveUser() {
		List<Usuario> userSave = new ArrayList<>();
		Usuario user1 = new Usuario();
		
		user1.setNome("Andrel");
		user1.setUsername("Andrezinho Parrasa");
		user1.setEmail("carai@docarai.memo");
		user1.setPassword("senhadificildocarai");
		
		Usuario user2 = new Usuario();
		
		user2.setNome("Andrelicia");
		user2.setUsername("Do carai");
		user2.setEmail("poxa@aemesmo.memo");
		user2.setPassword("123456");
		
		userSave.add(user1);
		userSave.add(user2);
		
		for(Usuario usa : userSave) {
			Usuario userSaved = user.save(usa);
			System.out.println("Usuário "+userSaved.getIdUser()+" salvo com sucesso !");
		}
	}
	/*
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
	*/
}
