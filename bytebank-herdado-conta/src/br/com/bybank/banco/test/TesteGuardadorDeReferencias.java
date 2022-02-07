package br.com.bybank.banco.test;

import br.com.bybank.banco.modelo.Conta;
import br.com.bybank.banco.modelo.ContaCorrente;
import br.com.bybank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
			guardador.adiciona(cc2);
		
			
			int tamanho = guardador.getQuantidadeDeElementos();
			System.out.println(tamanho);
			
			Conta ref = (Conta) guardador.getReferencia(1); //type cast
			
			System.out.println(ref.getNumero());
		}
		}