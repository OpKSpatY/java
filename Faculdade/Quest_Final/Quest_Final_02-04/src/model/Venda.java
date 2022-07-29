package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Venda {
	ArrayList<PagamentoAVista> vista = new ArrayList<PagamentoAVista>();
	ArrayList<PagamentoAPrazo> prazo = new ArrayList<PagamentoAPrazo>();
	private double totalVendido;
	private String aux="";
	private RegraDePagamento pagamento;
	Scanner scan = new Scanner(System.in);
	
	public void setRegraDePagamento(){
		System.out.println("Como será feito o pagamento?\n[V] A vista\n[P] A prazo");
		aux = scan.next();
		System.out.println("E quanto é o total vendido?");
		this.totalVendido = scan.nextDouble();
		switch(aux) {
		case "V":
			PagamentoAVista payment = new PagamentoAVista();
			vista.add(payment);
			break;
		case "P":
			PagamentoAPrazo prazo2 = new PagamentoAPrazo();
			prazo.add(prazo2);
			break;
		}
	
	}
	public double calcularTotal(double totalVendido) {
		try {
			switch(aux) {
			case "V":
				for (PagamentoAVista vista : vista) {
					return vista.pagar(totalVendido);
				}
			case "P":
				for (PagamentoAPrazo prazo : prazo) {
					return prazo.pagar(totalVendido);
				}
			}
		}
		catch(Exception e) {
			System.out.println("Não foi possível realizar os calculos, tente novamente!");
			return 0;
		}
		return 0;
	}
	
	public double getTotal() {
		return this.totalVendido;
	}
}
