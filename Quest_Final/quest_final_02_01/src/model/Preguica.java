//- Classe Preguica herda de Animal e sobrescreve o método emitirSom.  

package model;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	@Override
	public String emitirSom() {
		return "(barulhos de preguiça)*";
	}
	
}
