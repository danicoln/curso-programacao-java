package br.com.bybank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Daniel Lincoln
 *
 */

public abstract class Conta extends Object implements Comparable<Conta> {
	
    protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private String getNumero;
	private static int total = 0;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		Conta.total++; 
		//System.out.println("o total de contas ? " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma conta " + this.numero);
	}
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsulficienteException
	 */
	
	public void saca(double valor) throws SaldoInsulficienteException{
		
		if (this.saldo < valor) {
			//problema
			throw new SaldoInsulficienteException(" Saldo: " + this.saldo + " , Valor" + valor);
		}
		
		this.saldo -= valor;
		
		}
	
	public void transfere(double valor, Conta destino) throws SaldoInsulficienteException {
		this.saca(valor);
		destino.deposita(valor);
			
	}
	
	//aula 01 cap 5 29/12/2021
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
	return this.numero;
	}
	public void setNumero(int numero){
		if(numero <= 0) {
		System.out.println("n?o pode valor menor igual a 0 ");
		return;
		}
		
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("n?o pode valor menor que 0 ");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	/**
	 * 03/02/2022 aula Sobre o m?todo equals
	 * @param outra
	 * @return
	 */
	
	@Override
	public boolean equals (Object ref) {
		
		Conta outra = (Conta) ref; //cast
		
		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
			}
		
		return true;
		}
	
	@Override
	public int compareTo(Conta outra) {
	
		return Double.compare(this.saldo, outra.saldo);
		
	}
	
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return " Numero: " + this.numero + ", Agencia " +this.agencia + " Saldo " + this.saldo;
	
	}
}