package br.com.alura.Bybank;

import br.com.bybank.banco.modelo.Conta;
import br.com.bybank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {

		Conta c = new ContaCorrente (123, 321);
		
		c.deposita(200.0);
		
		System.out.println(c.getSaldo());
	}

}
