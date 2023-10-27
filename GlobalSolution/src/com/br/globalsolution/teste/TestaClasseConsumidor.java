package com.br.globalsolution.teste;

import com.br.globalsolution.classes.Consumidor;

public class TestaClasseConsumidor {

	public static void main(String[] args) {

		Consumidor testeConsumidor = new Consumidor();
		
		testeConsumidor.setCpf("123.456.789-00");
		testeConsumidor.setEmail("123456@gmail.com");
		testeConsumidor.setEndereco("Rua Lins de Vasconcelos, 308");
		testeConsumidor.setNome("Robson");
		
		System.out.println("CPF = " + testeConsumidor.getCpf());
		System.out.println("Email = " + testeConsumidor.getEmail());
		System.out.println("Endereço = " + testeConsumidor.getEndereco());
		System.out.println("Nome = " + testeConsumidor.getNome());
		

	}

}
