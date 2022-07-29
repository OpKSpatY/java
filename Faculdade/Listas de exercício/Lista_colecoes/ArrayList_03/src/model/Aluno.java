package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
	private String nome;
	private float nota1Bimestre;
	private float nota2Bimestre;
	private int cont;
	List lista = new ArrayList();
	Scanner scan = new Scanner(System.in);
	
	
	public Object getStudentvalues() {
		System.out.println("Digite o nome do aluno: ");
		lista.add(scan.next());
		for(int i=1; i<3; i++) {
			System.out.println("Agora, a " + i + "° nota do bimestre: ");
			lista.add(scan.nextInt());
		}
		return lista;
	}
	
	public void returnValues() {
		System.out.println("Eis os dados dos alunos: ");
		System.out.println("Respectivamente:\nNome, Nota 1° bim, Nota 2° bim: ");
		for(Object item: lista) {
			cont++;
			if (cont % 3 == 0) {
				System.out.print(item);
				System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			}
			else {
				System.out.print(item + "          ");
			}
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNota1Bimestre() {
		return nota1Bimestre;
	}
	public void setNota1Bimestre(float nota1Bimestre) {
		this.nota1Bimestre = nota1Bimestre;
	}
	public float getNota2Bimestre() {
		return nota2Bimestre;
	}
	public void setNota2Bimestre(float nota2Bimestre) {
		this.nota2Bimestre = nota2Bimestre;
	}
	
	
	
}
