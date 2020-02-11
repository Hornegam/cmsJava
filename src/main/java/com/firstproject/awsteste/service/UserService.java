package com.firstproject.awsteste.service;


import com.firstproject.awsteste.model.Usuario;


public interface UserService {
	
	Usuario criar(String nome, String username, String password, String email, String img);
	Usuario criar(String nome, String username, String password, String email);
	
	Usuario findById(long id);
	
	Usuario save(Usuario user);
	
}
