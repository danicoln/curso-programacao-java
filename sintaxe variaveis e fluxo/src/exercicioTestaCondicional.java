
public class exercicioTestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
	
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voce tem mais que 18 anos");
			System.out.println("Seja bem vindo");
		 } else {
		 			

			if (quantidadePessoas >= 2) {
				System.out.println("Voce n�o tem 18 anos, mas pode entrar, pois est� acompanhado");
			}else {
				System.out.println("Infelizmente voce n�o pode entrar");
			}
			
		}
	}
}