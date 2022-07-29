package model;

public class PagamentoAVista implements RegraDePagamento{

	public double pagar(double totalVendido) {
		return totalVendido * 1.2;
	}
	
}
