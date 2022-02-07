
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppot");
		nico.setCpf("123456789-88");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		//nico.salario = 300.0;
	}

}
