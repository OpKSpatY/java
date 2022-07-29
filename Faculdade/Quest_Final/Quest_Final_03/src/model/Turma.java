package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Turma {
	private String codigo;
	private String sala;
	private int horario;
	private ArrayList<Aluno> alunos;
	private Professor professor;
	
	public Turma(String codigo, String sala, int horario) {
		this.codigo = codigo;
		this.sala = sala;
		this.horario = horario;
		this.alunos = new ArrayList();
	}
	
	public String estaAberta() {
		if(horario < Calendar.HOUR) {
			return "Está aberta";
		}
		else {
			return "Está fechada.";
		}
	}
	
	public void DefinirProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void IncluirAluno(String nome, int matricula) {
		Aluno aluno = new Aluno(nome, matricula);
		alunos.add(aluno);
	}

	@Override
	public String toString() {
		return "Turma [codigo=" + codigo + ", sala=" + sala + ", horario=" + horario + ", alunos=" + alunos
				+ ", professor=" + professor + "]";
	}
	
	
}
