//- Classe Cavalo herda de Animal e sobrescreve o método emitirSom. 


package model;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	@Override
	public String emitirSom() {
		return "Ihaa";
	}

}
