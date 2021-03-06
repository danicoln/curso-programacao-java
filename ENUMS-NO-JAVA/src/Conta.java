@anota??o 

public abstract class Conta {

	protected  double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	
	public Conta(int agencia, int numero) {
		Conta.total++; 
		//System.out.println("o total de contas ? " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma conta " + this.numero);
	}
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
			
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}else {
		return false;
	}
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
}