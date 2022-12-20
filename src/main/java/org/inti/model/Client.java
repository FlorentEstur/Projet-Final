package org.inti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Client {

	@Id
	private int id;
	private String nom;
	private String username;
	private String password;
	
	
	public Client() {
		super();
	}


	public Client(int id, String nom, String username, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.username = username;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
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


	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
