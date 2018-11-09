package br.com.felipe.model;

import java.io.Serializable;

public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Double valor;
	
	public Produto() {
	
	}
	
	public Produto(Integer id, String nome, Double valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
