package com.br.globalsolution.teste;

import com.br.globalsolution.classes.Usuario;

public class TestaClasseUsuario {

	public static void main(String[] args) {

		Usuario testeUsuario = new Usuario();
		
		testeUsuario.setEmail("1234@gmail.com");
		testeUsuario.setEndereco("Avenida Lins de Vasconcelos, 208");
		testeUsuario.setNome("Gustavo");
		
		System.out.println("Email = " + testeUsuario.getEmail());
		System.out.println("Endereço = " + testeUsuario.getEndereco());
		System.out.println("Nome = " + testeUsuario.getNome());

	}

}
