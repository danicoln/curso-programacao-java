// transformar uma classe em uma interface. Dentro da interface n�o existe nada concreto, apenas abstrato.

// contrato Autenticavel;
//quem assinar esse contrato, precisa implementar
//metodo setSenha e autentica

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica (int senha);
	}
