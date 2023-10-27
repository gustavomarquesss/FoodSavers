package com.br.globalsolution.teste;

import com.br.globalsolution.classes.SugestaoReceitas;

public class TestaClasseSugestaoReceitas {

	public static void main(String[] args) {
		
		SugestaoReceitas testeSugestaoReceitas = new SugestaoReceitas();
		
		testeSugestaoReceitas.setAlimentos_disponiveis("Creme de leite, Leite condensado, Achocolato");
		
		System.out.println("Alimentos disponíveis = " + testeSugestaoReceitas.getAlimentos_disponiveis());

	}

}
