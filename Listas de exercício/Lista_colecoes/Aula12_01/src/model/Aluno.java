package model;

public class Aluno implements Comparable<Aluno>{
	private long matricula;
	private String nome;
	private String curso;
	
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
	public int compareTo(Aluno arg0) {
//		if (this.getNome().length() < arg0.getNome().length()) {
//			return -1;			
//		}
//		else if (this.getNome().contentEquals(arg0.getNome())) {
//			return 0;
//		}
//		else {
//			return 1;
//		}
		return this.getNome().compareToIgnoreCase(arg0.getNome());
	}
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", curso=" + curso + "]";
	}
	
}
