package br.com.dio.model;

import java.util.Objects;

public class Gato {

	private String nome;
	private String cor;
	private Integer idade;

	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
}