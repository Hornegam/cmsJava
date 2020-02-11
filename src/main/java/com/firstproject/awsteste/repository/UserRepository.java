package com.firstproject.awsteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstproject.awsteste.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
