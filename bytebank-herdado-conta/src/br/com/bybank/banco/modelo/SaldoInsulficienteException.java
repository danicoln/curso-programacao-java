package br.com.bybank.banco.modelo;
public class SaldoInsulficienteException extends Exception{
	
	public SaldoInsulficienteException (String msg) {
		super (msg);
	}
}
