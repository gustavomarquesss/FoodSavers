package com.br.globalsolution.classes;

//Herança

public class Estabelecimentos {
	private String nome;
    private String endereco = "Avenida Lins de Vasconcelos, 108";
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String MostrarEndereco() {
		return endereco;
	}
	public void AlterarEndereco(String endereco) {
		this.endereco = endereco;
	}
}
