// Gerente é um Funcionario, Gerente herda da class Funcionario
	
public class Designer extends Funcionario { 
	

	public double getBonificacao() {
		System.out.println("chamando metodo de bonificacao do Designer");
		return 200;
		
	}
}
	