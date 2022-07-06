package main;

import java.util.HashSet;
import java.util.Set;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cargos = new HashSet<String>();
		cargos.add("Professor");
		cargos.add("Diretor");
		cargos.add("Assistente");
		cargos.add("Administrador");
		cargos.add("Professor");
		
		System.out.println(cargos);
	}

}
