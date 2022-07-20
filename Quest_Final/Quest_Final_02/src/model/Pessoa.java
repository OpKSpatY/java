/* Defina uma classe Java para representar uma pessoa. Uma pessoa, no nosso caso, possui os seguintes atributos: 
 * Nome, Idade, Altura, Peso, Sexo

A classe deve possuir métodos para modificar e acessar cada um dos atributos (get/set), construtor,  um método para calcular 
o IMC (Índice de Massa Corpórea) e um método toString() que fornece o nome da pessoa e uma descrição de sua categoria de acordo com o IMC

 

O ICM é obtido através da divisão do peso pela altura (em metros) ao quadrado e é interpretado da seguinte forma:

   IMC <= 18,5:  Abaixo do peso normal

   18,5 < IMC <= 25:  Peso Normal

    25 < IMC <= 30: Acima do peso normal.

    IMC > 30: Obesidade */


package model;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	private double imc;
	
	public Pessoa(String nome, int idade, double altura, double peso, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getIMC() {
		/* 
		    O IMC é obtido através da divisão do peso pela altura (em metros) ao quadrado e é interpretado da seguinte forma:

		   	IMC <= 18,5:  Abaixo do peso normal
		
		   	18,5 < IMC <= 25:  Peso Normal
		
		    25 < IMC <= 30: Acima do peso normal.
		
		    IMC > 30: Obesidade 
	    */
		this.imc = peso/(altura*altura);
		if (imc <= 18.5) {
			return "Abaixo do peso normal";
		}
		else if (imc > 18.5 && imc <= 25) {
			return "Peso normal";
		}
		else if (imc > 25 && imc <= 30) {
			return "Acima do peso normal";
		}
		else {
			return "Obesidade";
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + ", sexo=" + sexo
				+ ", imc=" + imc + "]";
	}
	
	
}
