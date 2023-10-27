package com.br.globalsolution.teste;

import com.br.globalsolution.classes.Produtor;

public class TestaClasseProdutor {

	public static void main(String[] args) {

		Produtor testeProdutor = new Produtor();
		
		testeProdutor.setCnpj("12.345.678/0009-9");
		testeProdutor.setEmail("654321@gmail.com");
		testeProdutor.setEndereco("Rua Vasconcelos de Lins, 408");
		testeProdutor.setNome("Joca LTDA");
		
		System.out.println("CNPJ = " + testeProdutor.getCnpj());
		System.out.println("Email = " + testeProdutor.getEmail());
		System.out.println("Endereço = " + testeProdutor.getEndereco());
		System.out.println("Nome = " + testeProdutor.getNome());
		

	}

}
