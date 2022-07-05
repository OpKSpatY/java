package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Aluno;

public class Main {

	public static void main(String[] args) {
		List<Aluno> listaaluno = new ArrayList<Aluno>();
		Scanner scan = new Scanner(System.in);
		for(int i=0; i <3; i++) {
			Aluno aluno = new Aluno();
			System.out.println("Digite o nome do " + (i+1) + "aluno: ");
			aluno.setNome(scan.next());
			System.out.println("Agora, a matrícula dele: ");
			aluno.setMatricula(scan.nextLong());
			System.out.println("Por fim, seu curso: ");
			aluno.setCurso(scan.next());
			for (Aluno item: listaaluno) {
				if (aluno.compareTo(item) == 1) {
					System.out.println(item.toString());
				}
			}
			listaaluno.add(aluno);

		}
	}

}
