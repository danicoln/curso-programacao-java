
public class TesteSalario {
	
	public static void main(String[] args) {

		boolean foiPromovido = true;
		
		if (foiPromovido) {
			double salario = 4200.00;
		} else {
			double salario = 3800.00;
			
			System.out.println(salario);
		}
	}
}
// exercicio pagina 09 // 
//O c�digo nem compila, pois fora do bloco if/else a vari�vel salario n�o existe mais.
// a variavel "salario" s� � visivel dentro do bloco if/else.