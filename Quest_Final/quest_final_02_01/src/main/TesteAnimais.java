//- Classe TesteAnimais que tem uma coleção (List) de Animal com 10 posições.  

package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.Animal;
import model.Cachorro;
import model.Cavalo;
import model.Preguica;

public class TesteAnimais {

	public static void main(String[] args) {
		ArrayList<Animal> animais = new ArrayList<Animal>();
		String nome;
		int idade;
		String choose="";
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Digite a seguir o nome do " + (i+1) + "° animal: ");
			nome = scan.next();
			System.out.println("Digite a idade dele: ");
			idade = scan.nextInt();
			System.out.println("Seu animal é: \n[P] Preguiça\n[C] Cavalo\n[K] Cachorro");
			choose = scan.next();
			switch(choose) {
			case "P":
				Preguica preguica = new Preguica(nome, idade);
				animais.add(preguica);
				break;
			case "C":
				Cavalo cavalo = new Cavalo(nome, idade);
				animais.add(cavalo);
				break;
			case "K":
				Cachorro cachorro = new Cachorro(nome, idade);
				animais.add(cachorro);
				break;
			}
		}
		for (Animal animal : animais) {
			System.out.println("Nome do animal: " + animal.getNome());
			System.out.println("Idade do animal: " + animal.getIdade());
			System.out.println("Que som ele faz: " + animal.emitirSom());
		}
	}

}
