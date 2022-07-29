package main;

import java.util.Scanner;

import model.Aluno;

public class Main {
	public static void main(String[] args) {
		Aluno alunos = new Aluno();
		Scanner scan = new Scanner(System.in);
		alunos.getStudentvalues();
		while (true){
			System.out.println("Deseja adicionar mais algum aluno? \n[1] Sim\n[Qualquer outra letra] Não");
			String test = scan.next();
			if (test.equals("1")) {
				alunos.getStudentvalues();
			}
			else if (!test.equals("1")){
				alunos.returnValues();
				break;
			}
		}
	}
}
