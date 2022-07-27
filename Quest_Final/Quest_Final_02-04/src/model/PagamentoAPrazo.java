package model;

public class PagamentoAPrazo implements RegraDePagamento{

	public double pagar(double totalVendido) {
		return totalVendido * 2;
	}


}
