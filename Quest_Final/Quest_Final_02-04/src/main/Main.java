package main;

import model.Venda;

public class Main {

	public static void main(String[] args) {
		Venda venda = new Venda();
		venda.setRegraDePagamento();
		System.out.println(venda.calcularTotal(venda.getTotal()));
	}

}
