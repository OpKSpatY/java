package main;

import model.Professor;
import model.Turma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor("Gustavo", "POO");
		Turma turma = new Turma("1234-B","2-A", 19);
		turma.DefinirProfessor(professor);
		System.out.println(turma.toString());
		turma.IncluirAluno("Pedro", 2212);
	}

}
