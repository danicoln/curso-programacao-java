package bytebank;
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLincoln = new Conta();
		contaDoLincoln.saldo = 100.00;
		contaDoLincoln.deposita(50);
		System.out.println(contaDoLincoln.saldo);
		
		boolean conseguiuRetirar = contaDoLincoln.saca(20);
		System.out.println(contaDoLincoln.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(3000, contaDoLincoln);
		if (sucessoTransferencia) {
		System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoLincoln.saldo);
		
		
		contaDoLincoln.titular = "daniel lincoln";
		System.out.println(contaDoLincoln.titular );
	
	}
}