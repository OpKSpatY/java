//- Crie uma classe Cachorro que herda de Animal e sobrescreve o método emitirSom. 

package model;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	@Override
	public String emitirSom() {
		return "Au! Au!";
	}

}
