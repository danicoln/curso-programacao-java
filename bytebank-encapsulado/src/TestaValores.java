
public class TestaValores {
	public static void main(String[] args) {
		int total = 0;
		Conta conta = new Conta(1337, 24226);
		total++;
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16459);
		Conta conta3 = new Conta(1337, 164590);

		System.out.println(Conta.getTotal());
	}

}
