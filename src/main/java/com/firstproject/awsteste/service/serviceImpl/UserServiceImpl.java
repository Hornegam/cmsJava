package com.firstproject.awsteste.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject.awsteste.model.Usuario;
import com.firstproject.awsteste.repository.UserRepository;
import com.firstproject.awsteste.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public Usuario criar(String nome, String username, String password, String email, String img) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario criar(String nome, String username, String password, String email) {
		
		return null;
	}

	@Override
	public Usuario findById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public Usuario save(Usuario user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	
	

}
