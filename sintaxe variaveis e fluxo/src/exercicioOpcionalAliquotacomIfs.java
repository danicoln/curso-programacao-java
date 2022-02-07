
public class exercicioOpcionalAliquotacomIfs {
	
	public static void main(String[] args) {
		
		double salario = 2500.00;
		
		if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("o IR é de 7,5% ");
			System.out.println("pode deduzir na declaração o valor de R$ 142.00");
		}
		if (salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("o IR é de 15% ");
			System.out.println("pode deduzir R$ 350.00 ");
		}
			
		if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("o IR é de 22.5%");
			System.out.println("pode deduzir R$ 636.00 ");
			
		}
	}

}

// exercicio feito sem ajuda // sem correção / / ver TesteIR2