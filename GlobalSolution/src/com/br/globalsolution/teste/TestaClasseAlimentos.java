package com.br.globalsolution.teste;

import com.br.globalsolution.classes.Alimentos;

public class TestaClasseAlimentos {

	public static void main(String[] args) {

		Alimentos testeAlimentos = new Alimentos();
		
		testeAlimentos.setCategoria("Animal");
		testeAlimentos.setData_vencimento("19/08/2023");
		testeAlimentos.setNome("Coxão mole");
		
		System.out.println("Categoria = " + testeAlimentos.getCategoria());
		System.out.println("Data de vencimento = " + testeAlimentos.getData_vencimento());
		System.out.println("Nome = " + testeAlimentos.getNome());

	}

}
