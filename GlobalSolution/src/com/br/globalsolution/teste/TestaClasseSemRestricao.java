package com.br.globalsolution.teste;

import com.br.globalsolution.classes.SemRestricao;

public class TestaClasseSemRestricao {

	public static void main(String[] args) {
		
		SemRestricao testeSemRestricao = new SemRestricao();
		
        testeSemRestricao.setRestricoes_alimentares("Nenhuma restrição");
        
        System.out.println("Restrições alimentares = " + testeSemRestricao.getRestricoes_alimentares());
        

	}

}
