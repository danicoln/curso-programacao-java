package br.com.bybank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; // objeto literal
		//String outra = new String ("Alura");
		
		
	String outra = nome.replace("A", "a");
		
		//String outra = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(outra);
		
		for(int i = 0; i < nome.length(); i++) {
		    System.out.println(nome.charAt(i));
		} 
	}

}
