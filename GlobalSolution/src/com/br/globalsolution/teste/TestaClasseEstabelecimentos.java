package com.br.globalsolution.teste;

import com.br.globalsolution.classes.Estabelecimentos;

public class TestaClasseEstabelecimentos {

	public static void main(String[] args) {

		Estabelecimentos testeEstabelecimentos = new Estabelecimentos();
		
		testeEstabelecimentos.AlterarEndereco("Avenida Lins de Vasconcelos, 108");
		testeEstabelecimentos.setNome("Unidade 3");
		
		System.out.println("Endereço = " + testeEstabelecimentos.MostrarEndereco());
		System.out.println("Nome = " + testeEstabelecimentos.getNome());

	}

}
