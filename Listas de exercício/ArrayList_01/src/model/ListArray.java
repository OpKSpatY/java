/* Escreva um algoritmo que utilize um ArrayList para ler uma lista de 10 números informados
   pelo usuário. Ao final, exiba na console todos os valores inferiores a 40.
 */

package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListArray {
	Scanner scan = new Scanner(System.in);
	List<Integer> lista = new ArrayList<>();
	int cont=0;
	
	public Object returnNums() {
		for(int i=0; i<10; i++) {
			System.out.println("Informe o " + (i+1) + "° valor: ");
			lista.add(scan.nextInt());
		}
		return lista;
	}
	
	public void showData() {
		for(int num:lista) {
			cont ++;
			if (num < 40 && cont != 10 ) {
				System.out.print(num + ", ");
			}
			else if (num < 40 && cont == 10) {
				System.out.print(num);
			}
		}
	}
}
