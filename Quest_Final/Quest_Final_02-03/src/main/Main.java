package main;

import model.ComputadorDeMesa;
import model.Smartphone;

public class Main {

	public static void main(String[] args) {
		Smartphone iphone = new Smartphone("Apple", "sei lá", "4gb", "256gb", "11''", "4K", "Vivo");
		ComputadorDeMesa pc_gamer = new ComputadorDeMesa("Asus", "I9", "32gb", "5tb", "Corsair", "Quadrado", "1000W");
		
		System.out.println(iphone.toString());
		System.out.println(pc_gamer.toString());
	}

}
