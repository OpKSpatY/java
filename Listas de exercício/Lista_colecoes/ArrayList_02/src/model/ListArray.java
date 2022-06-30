/* Escreva um algoritmo que faça a leitura 8 valores digitados pelo usuário em uma lista. Após,
apresente na console todos os valores negativos e a soma dos números positivos. */

package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListArray {
	List<Integer> lista = new ArrayList<Integer>();
	Scanner scan = new Scanner(System.in);
	int cont=0, contNeg=0, sum=0;
	
	public ListArray(){
		// constructor vazio
	}
	
	public void getResults() {
		readNums();
		getNegatives();
		getSum();
	}
	
	public Object readNums() {
		for (int i=0;i < 8; i++) {
			System.out.println("Digite o " + (i+1) + "° número da lista: ");
			lista.add(scan.nextInt());
		}
		return lista;
	}
	
	public void getNegatives() {
		System.out.println("Eis os valores negativos: ");
		for (int num: lista) {
			cont++;
			if (num < 0 && cont != 8) {
				System.out.print(num + ".. ");
				contNeg ++;
			}
			else if(num < 0 && cont == 8 || cont == 8){
				System.out.print(num);
				contNeg ++;
			}
			else if (contNeg==0) {
				System.out.println("Não houveram valores negativos na lista!");
			}
		}
		System.out.println();
	}
	
	public void getSum() {
		for (int num: lista) {
			if (num >= 0) {
				sum+= num;
			}
		}
		System.out.println("A soma dos valores positivos foi: " + sum);
	}
}
