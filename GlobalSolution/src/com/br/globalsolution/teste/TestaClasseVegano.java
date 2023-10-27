package com.br.globalsolution.teste;

import com.br.globalsolution.classes.Vegano;

public class TestaClasseVegano {

	public static void main(String[] args) {
		
		Vegano testeVegano = new Vegano();
		
		testeVegano.setRestricoes_alimentares("Não consome produtos de origem animal");
		
		System.out.println("Vegano = " + testeVegano.getRestricoes_alimentares());

	}

}
