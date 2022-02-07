// Gerente � um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel, � um Autenticavel;

public class Gerente extends Funcionario implements Autenticavel { 

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
	this.autenticador = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		
	System.out.println("Chamando o m�todo de bonifica��o do Gerente");
		return super.getSalario();
		
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
			}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
	