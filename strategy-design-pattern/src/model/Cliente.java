package model;

import java.math.BigDecimal;

public class Cliente {
	
	private String name;
	private String email;
	private String telefone;
	
	
	
	public Cliente(String name, String email, String telefone) {
		super();
		this.name = name;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	
	
	
}
