package com.br.globalsolution.teste;

import com.br.globalsolution.classes.ListaInventario;

public class TestaClasseListaInventario {

	public static void main(String[] args) {
		
		ListaInventario testeListaInventario = new ListaInventario();
		
		testeListaInventario.setDespensa("Nescau - Data de vencimento 20/12/2023, Arroz - Data de vencimento 17/10/2023");
		testeListaInventario.setFreezer("Bacon - Data de vencimento 28/09/2023, Sorvete - Data de vencimento 10/07/2023");
		testeListaInventario.setGeladeira("Leite - Data de vencimento 10/07/2023, Presunto - Data de vencimento 16/10/2023");
		
		System.out.println("Despensa = " + testeListaInventario.getDespensa());
		System.out.println("Freezer = " + testeListaInventario.getFreezer());
		System.out.println("Geladeira = " + testeListaInventario.getGeladeira());

	}

}
