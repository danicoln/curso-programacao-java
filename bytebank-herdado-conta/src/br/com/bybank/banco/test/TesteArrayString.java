package br.com.bybank.banco.test;

import br.com.bybank.banco.modelo.Cliente;
import br.com.bybank.banco.modelo.Conta;
import br.com.bybank.banco.modelo.ContaCorrente;
import br.com.bybank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {
	
	System.out.println("Funcionou!");
	
	for (int i = 0; i < args.length; i++) {
		System.out.println(args[i]);
	}
	}	
}
