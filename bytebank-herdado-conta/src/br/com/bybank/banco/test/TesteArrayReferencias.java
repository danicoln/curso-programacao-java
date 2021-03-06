package br.com.bybank.banco.test;

import br.com.bybank.banco.modelo.Cliente;
import br.com.bybank.banco.modelo.Conta;
import br.com.bybank.banco.modelo.ContaCorrente;
import br.com.bybank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int [] idades = new int [5];
		Object[] contas = new Object[5];
		
		System.out.println(contas.length);
		
		ContaCorrente cc1 = new ContaCorrente(22,11); //objeto criado
		
		
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca (33, 22);
		
		contas[1] = cc2;
		
		Cliente cliente = new Cliente();
		contas[2] = cliente;
		
		Object referenciaGenerica = contas[1];
		//System.out.println(cc2.getNumero());
		//System.out.println(referenciaGenerica[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca)contas[1]; //type cast

		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	}
}
