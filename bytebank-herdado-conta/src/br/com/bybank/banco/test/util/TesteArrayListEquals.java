package br.com.bybank.banco.test.util;

import java.util.ArrayList;

import br.com.bybank.banco.modelo.Cliente;
import br.com.bybank.banco.modelo.Conta;
import br.com.bybank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
	
		// os colchetes <> chama-se Generics
		ArrayList <Conta> lista = new ArrayList<Conta>();
		
		
		
			Conta cc = new ContaCorrente(22, 11);
			lista.add(cc);
		
			Conta cc2 = new ContaCorrente(22, 22);
			lista.add(cc2);
			
			Conta cc3 = new ContaCorrente(22, 22);
			boolean existe = lista.contains(cc3);
			
			System.out.println("J? existe? " + existe);
						
			for(Conta conta : lista) {
				System.out.println(conta);
			}
			
			
	}

}
