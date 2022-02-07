package br.com.bybank.banco.test;

import br.com.bybank.banco.modelo.CalculadorDeImposto;
import br.com.bybank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		br.com.bybank.banco.modelo.ContaCorrente cc = new br.com.bybank.banco.modelo.ContaCorrente (222, 333); // cria conta corrente;
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida(); // cria seguro de vida;
		
		CalculadorDeImposto calc = new CalculadorDeImposto(); // cria calculador de imposto;
		calc.registra(cc); 
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
