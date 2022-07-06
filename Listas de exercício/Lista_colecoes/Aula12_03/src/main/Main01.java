package main;

import java.util.HashMap;
import java.util.Map;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> mapa = new HashMap<String, String>();
		mapa.put("000.000.000-00", "Maria");
		mapa.put("000.000.000-01", "José");
		mapa.put("000.000.000-02", "João");
		for (String value: mapa.values()) {
			System.out.println(value);
		}
		
		mapa.forEach((k,v) -> System.out.println("Key> " + k + "\nValue: " + v));
		
	}

}
