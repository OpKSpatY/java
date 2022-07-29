/* Fa�a um algoritmo para ler uma lista de 30 n�meros. Ap�s isto, ler mais um n�mero
qualquer informado pelo usu�rio, calcular e escrever quantas vezes esse n�mero aparece na
cole��o.  */

package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListArray {
	int cont;
	Scanner scan = new Scanner(System.in);
	List<Double> lista = new ArrayList<>();
	
	public Object populateList() {
		for(int i=0; i<30; i++) {
			double random = Math.random();
			if (i < 10) {
				lista.add(Math.floor(random*10));
			}
			else if (i > 10) {
				lista.add(Math.floor(random*100));
			}
		}
		return lista;
	}
	
	public void checkValue() {
		System.out.println("Informe o valor que deseja verificar: ");
		Double valor = scan.nextDouble();
		for (Double item: lista) {
			if (item.equals(valor)) {
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("N�o houveram correspond�ncias do valor informado! ");
		}
		else {
			System.out.println("Houveram " + cont + " correspond�ncias do valor " + valor 
					+ " na lista!");
		}
		System.out.println(cont);
	}
	
	public void printList() {
		Collections.sort(lista);
		for (double item: lista) {
			System.out.print(item + ", ");
		}
	}
}
