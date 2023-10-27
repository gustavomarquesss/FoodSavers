package com.br.globalsolution.teste;

import com.br.globalsolution.classes.PersonalizacaoPerfil;

public class TestaClassePersonalizacaoPerfil {

	public static void main(String[] args) {

		 PersonalizacaoPerfil testePersonalizacaoPerfil = new PersonalizacaoPerfil();
		 
		 testePersonalizacaoPerfil.setRestricoes_alimentares("Não como produtos de origem animal");
		 
		 System.out.println("Restrições alimentares = " + testePersonalizacaoPerfil.getRestricoes_alimentares());

	}

}
