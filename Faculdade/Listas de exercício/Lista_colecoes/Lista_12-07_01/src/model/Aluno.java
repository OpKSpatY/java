package model;

public class Aluno implements Comparable<Aluno>{
	long matricula;
	String nome;
	String curso;
	
	public Aluno() {
		
	}
	
	public Aluno(long matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}
	
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public int compareTo(Aluno outroAluno) {
		if (this.getMatricula() == outroAluno.getMatricula()) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", curso=" + curso + "]";
	}
	
			
}
