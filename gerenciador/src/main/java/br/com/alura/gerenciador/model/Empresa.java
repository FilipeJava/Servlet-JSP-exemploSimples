package br.com.alura.gerenciador.model;

import java.util.Date;

public class Empresa {
	
	int id;
	String nome;
	private Date dataAbertura = new Date();
	
	
	
	public Empresa() {
	
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
	
	

	
	
	
	
	
	

}
