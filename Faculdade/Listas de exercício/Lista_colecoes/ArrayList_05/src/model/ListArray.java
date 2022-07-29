package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListArray {
	Scanner scan = new Scanner(System.in);
	List<Double> lista = new ArrayList<>();
	double maior, menor;	
	
	public Object populateList() {
		for(int i=0; i<10; i++) {
			System.out.println("Digite o " + (i+1) + " valor: ");
			lista.add(scan.nextDouble());
			if (i == 0) {
				menor = lista.get(0);
				maior = lista.get(0);
			}
		}
		return lista;
	}
	
	public void getExtremes() {
		for(Double item: lista) {
			if (item> maior) {
				maior = item;
			}
			else if(item < menor) {
				menor = item;
			}
		}
		System.out.println("O maior valor da lista é: " + maior + "\nE o menor valor é: " + menor);
	}
}

