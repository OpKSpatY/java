package main;

import model.CadastroCliente;
import model.Cliente;


public class Main {
	Cliente cliente = new Cliente();
	public static void main(String[] args) {
		CadastroCliente cadastrar = new CadastroCliente();
		for(int i=0; i<10; i++) {
			cadastrar.cadastrarCliente();
		}
		cadastrar.ordenarLista();
		cadastrar.printList();
	}

}
