/* Fa�a um algoritmo que leia uma cole��o (lista) de 15 n�meros inteiros informados pelo
usu�rio. Ao final, calcule e escreva a m�dia aritm�tica dos valores. */

package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListArray {
	Scanner scan = new Scanner(System.in);
	List<Double> lista = new ArrayList<>();
	double med;
	
	public Object getValues() {
		for (int i=0; i<15; i++) {
			try {
				System.out.println("Digite o " + (i+1) +"� valor: ");
				lista.add(scan.nextDouble());
			}
			finally {
				if (i == 14) {
					System.out.println("Fim!");
				}
			}
			
		}
		return lista;
	}
	
	public void calcAritm() {
		for (Double item: lista) {
			med += item;
		}
		med /= 15;
		
		System.out.println("A m�dia aritm�tica dos valores informados �: " + med);
	}
	
}
