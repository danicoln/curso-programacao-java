
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		
		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("vc n tem 18 anos, mas pode entrar" + " pois est� acompanhado");
				
				
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}
	}
	}
}
		