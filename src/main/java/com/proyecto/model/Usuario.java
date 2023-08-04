package com.proyecto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "usuario")
public class Usuario {
	
	private Integer id;
	private String name;
	private String username;
	private String email;
	private String direccion;
	private String telefono;
	private String tipo;
	private String contra;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(Integer id, String name, String username, String email, String direccion, String telefono,
			String tipo, String contra) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
		this.contra = contra;
	}
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", direccion="
				+ direccion + ", telefono=" + telefono + ", tipo=" + tipo + ", contra=" + contra + "]";
	}

}
