package br.com.bybank.banco.modelo;

public class CalculadorDeImposto {
//br.com.bybank.banco.modelo.CalculadorDeImpostos => FQN
	private double totalImposto;	
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
