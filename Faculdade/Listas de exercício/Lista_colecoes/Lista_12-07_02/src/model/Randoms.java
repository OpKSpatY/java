package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randoms {
	List<Integer> lista = new ArrayList<Integer>();
	
	public void populateList() {
		for(int i = 0; i<50; i++) {
			int a = new Random().nextInt(50);
			if(!lista.contains(a)) {
				lista.add(a);
			}
		}
	}
	
	public void getList() {
		for(Integer item: lista) {
			System.out.print(item + ", ");
		}
		System.out.println();
	}
}
