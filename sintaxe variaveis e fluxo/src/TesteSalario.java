
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
//O código nem compila, pois fora do bloco if/else a variável salario não existe mais.
// a variavel "salario" só é visivel dentro do bloco if/else.