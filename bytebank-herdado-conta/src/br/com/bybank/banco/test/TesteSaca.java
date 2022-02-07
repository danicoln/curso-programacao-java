package br.com.bybank.banco.test;

import br.com.bybank.banco.modelo.Conta;
import br.com.bybank.banco.modelo.ContaCorrente;
import br.com.bybank.banco.modelo.SaldoInsulficienteException;

public class TesteSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente (123, 321);
		
		conta.deposita(200.0);
		try {
			
		conta.saca(210.0);
		
		} catch (SaldoInsulficienteException ex) {
			System.out.println (" Ex: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
