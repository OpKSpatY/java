package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CadastroCliente{
	Scanner scan = new Scanner(System.in);
	private ArrayList<Cliente> lista = new ArrayList<Cliente>();
	private String variavel;
	private int cpf;
	public void cadastrarCliente() {
		Cliente cliente = new Cliente();
		System.out.println("Digite o nome do cliente: ");
		variavel = scan.next();
		cliente.setNome(variavel="");
		System.out.println("Digite o CPF do cliente: ");
		cpf = scan.nextInt();
		cliente.setCpf(cpf);
		System.out.println("Digite a data de nascimento do cliente: (DD/MM/AAAA)");
		variavel = scan.next();
		cliente.setData_nascimento(variavel);
		System.out.println("Por último, o endereço dele:");
		variavel = scan.next();
		cliente.setEndereco(variavel);
		lista.add(cliente);
		System.out.println("Cliente adicionado com sucesso!");
	}
	
	public void printList() {
		for (Object cliente : lista) {
			System.out.println(cliente.toString());
		}
	}
	
	public void ordenarLista() {
		Collections.sort(lista);
		
		System.out.println(lista);
	}

}
