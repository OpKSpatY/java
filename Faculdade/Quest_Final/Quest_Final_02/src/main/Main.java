package main;

import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Pedro", 20, 1.80, 81, "M");
		
		System.out.println(pessoa.getIMC());
		System.out.println(pessoa.toString());
	}

}
