package com.br.globalsolution.teste;

import com.br.globalsolution.classes.EstoqueDisponivel;

public class TestaClasseEstoqueDisponiveis {

	public static void main(String[] args) {
		
		EstoqueDisponivel testeEstoqueDisponivel = new EstoqueDisponivel();
		
		testeEstoqueDisponivel.setAlimentosDisponiveis("Banana, frango, leite, ovo");
		testeEstoqueDisponivel.AlterarEndereco("Avenida Lins de Vasconcelos, 108");
		testeEstoqueDisponivel.setNome("Unidade 3");
		
		System.out.println("Alimentos disponiveis para consumo = " + testeEstoqueDisponivel.getAlimentosDisponiveis());
		System.out.println("Endereço = " + testeEstoqueDisponivel.MostrarEndereco());
		System.out.println("Nome = " + testeEstoqueDisponivel.getNome());
		
		

	}

}
