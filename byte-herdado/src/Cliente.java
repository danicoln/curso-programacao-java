
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Cliente() { // Construtor padrão;
		this.autenticador = new AutenticacaoUtil(); //instancia
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
			}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
}
}