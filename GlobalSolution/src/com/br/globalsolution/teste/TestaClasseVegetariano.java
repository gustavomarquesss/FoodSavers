package com.br.globalsolution.teste;

import com.br.globalsolution.classes.Vegetariano;

public class TestaClasseVegetariano {

	public static void main(String[] args) {
		
		Vegetariano testeVegetariano = new Vegetariano();
		
		testeVegetariano.setRestricoes_alimentares("Não consome carne");
		
		System.out.println("Vegetariano = " + testeVegetariano.getRestricoes_alimentares());

	}

}
