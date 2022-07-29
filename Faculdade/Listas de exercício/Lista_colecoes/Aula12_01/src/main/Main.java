package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Aluno;

public class Main {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno aluno = new Aluno();
		aluno.setMatricula(1);
		aluno.setNome("Pedro");
		aluno.setCurso("TSI");
		alunos.add(aluno);
		
		aluno = new Aluno();
		aluno.setMatricula(2);
		aluno.setNome("Edilson");
		aluno.setCurso("TSI");
		alunos.add(aluno);
		
		aluno = new Aluno();
		aluno.setMatricula(3);
		aluno.setNome("Jorge");
		aluno.setCurso("TSI");
		alunos.add(aluno);
	
		System.out.println(alunos);
		
		Collections.sort(alunos);
		
		System.out.println(alunos);
	}

}
