
public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente daniel = new Cliente();
		// conta.titular = paulo;
		daniel.setNome ("Daniel Lincoln");
		
		conta.setTitular(daniel);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(daniel);
		System.out.println(conta.getTitular());
		
	}

}
