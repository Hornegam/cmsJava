package com.firstproject.awsteste.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="TB_USER")

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idUser;
	
	private String imgProfile;

	@NotBlank
	private String nome;
	@NotBlank
	private String username;
	@NotBlank
	private String password;
	@NotBlank
	private String email;
	
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getImgProfile() {
		return imgProfile;
	}
	public void setImgProfile(String imgProfile) {
		this.imgProfile = imgProfile;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
