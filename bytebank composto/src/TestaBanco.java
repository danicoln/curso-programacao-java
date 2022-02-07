
public class TestaBanco {
	public static void main(String[] args) {
		Cliente lincoln = new Cliente();
		lincoln.nome = "Daniel Lincoln";
		lincoln.cpf = "222.222.222-22";
		lincoln.profissao = "Programador";
		
		Conta contaDoLincoln = new Conta();
		contaDoLincoln.deposita(100);
		
		contaDoLincoln.titular = lincoln;
		System.out.println(contaDoLincoln.titular.nome);
		System.out.println(contaDoLincoln.titular);	
		System.out.println(lincoln);
	}

}