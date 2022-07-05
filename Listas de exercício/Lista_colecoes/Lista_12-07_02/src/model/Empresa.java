package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Empresa {
	List<String> listaCargos = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	
	public void populateList() {
		System.out.println("Quantos cargos deseja adicionar em sua empresa?");
		int qtd = scan.nextInt();
		for(int i=0; i<qtd; i++) {
			System.out.println("Digite o " + (i+1) + "° cargo: ");
			String aux = scan.next();
			if(i>=1) {
				for(String item : listaCargos) {
					if(item.equals(aux)) {
						System.out.println("O cargo '" + aux + "' já existe!");
					}
					else {
						listaCargos.add(aux);
						System.out.println("Cargo adicionado!");
					}
				}
			}
			else if(i==0) {
				listaCargos.add(aux);
			}
		}
	}
	
	public void getList() {
		for(String item:listaCargos) {
			System.out.println(item + "\n");
		}
	}
}
