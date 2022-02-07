
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
	
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2; // boolean : só pode colocar true ou false
		
		System.out.println("valor acompanhado = " + acompanhado ) ;
		
		if (idade >= 18 && acompanhado ) { // usando || ou && 
			System.out.println("Voce tem mais que 18 anos");
			System.out.println("Seja bem vindo");
		 	}else {
			System.out.println("Infelizmente voce não pode entrar");
			}	
		}
	}