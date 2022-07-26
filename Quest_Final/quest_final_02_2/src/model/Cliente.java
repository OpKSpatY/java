package model;

import java.util.ArrayList;

public class Cliente implements Comparable<Cliente>{
	private int cpf;
	private String nome;
	private String data_nascimento;
	private String endereco;
	
	public Cliente() {
		
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", data_nascimento=" + data_nascimento + ", endereco="
				+ endereco + "]";
	}

	public Cliente(int cpf, String nome, String data_nascimento, String endereco) {
		this.data_nascimento = data_nascimento;
		this.cpf = cpf;
		this.endereco = endereco;
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public int compareTo(Cliente temp) {		
		return String.valueOf(this.getCpf())
				.compareToIgnoreCase(String.valueOf(temp.getCpf()));
	}
}
