package com.br.globalsolution.teste;

import com.br.globalsolution.classes.RankingMetas;

public class TestaClasseRankingMetas {

	public static void main(String[] args) {
		
		RankingMetas testeRankingMetas = new RankingMetas();
		
		testeRankingMetas.setObjetivos("Seu próximo objetivo é aproveitar 100% dos seus alimentos!");
		
		System.out.println("Objetivo = " + testeRankingMetas.getObjetivos());

	}

}
