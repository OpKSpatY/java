/* Com rela��o aos conhecimentos estudados sobre Programa��o Orientada a Objetos, crie a classe denominada DataUtil 
 * e implemente os m�todos informados abaixo:

Escreva um m�todo est�tico que retorne a data corrente;
Escreva um m�todo est�tico que retorne o ano corrente;
Escreva um m�todo est�tico que retorne o m�s corrente;
Escreva um m�todo est�tico que retorne o dia do m�s corrente;
Escreva um m�todo est�tico que retorne a hora corrente;
Escreva um m�todo est�tico que retorne o minuto corrente;
Escreva um m�todo est�tico que retorne o segundo corrente;
Ao final, crie a classe DataMain e defina o m�todo main, implemente as chamadas a cada um dos m�todos, imprimindo na console
o resultado de cada opera��o. */


package model;

import java.util.Calendar;
import java.util.Locale;

public class DataUtil {
	
	public static void getDay() {
		Calendar calendario = Calendar.getInstance();
		System.out.println("Hoje � dia: ");
		System.out.println(calendario.get(Calendar.DATE) + "/" + calendario.get(Calendar.MONTH) + "/" + calendario.get(Calendar.YEAR));
		System.out.println();
	}
	
	public static void getYear() {
		Calendar calendario = Calendar.getInstance();
		System.out.println("Estamos no ano de: " + calendario.get(Calendar.YEAR));
	}
	
	public static void getMonth() {
		Calendar calendario = Calendar.getInstance();
		System.out.println("Estamos no m�s de " + calendario.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("pt")));
	}
	
	public static void getDayOfMonth() {
		Calendar calendario = Calendar.getInstance();
		System.out.println("Hoje � dia " + calendario.get(Calendar.DAY_OF_MONTH));
	}
	
	public static void getHour() {
		Calendar calendario = Calendar.getInstance();
		System.out.println("Agora s�o: " + calendario.get(Calendar.HOUR_OF_DAY) + "h" + calendario.get(Calendar.MINUTE));
	}
	
	public static void getMin() {
		Calendar calendario = Calendar.getInstance();
		System.out.println("Do dia, os minutos s�o: " + calendario.get(Calendar.MINUTE) + " minutos.");
	}
	
	public static void getSecs() {
		Calendar calendario = Calendar.getInstance();
		System.out.println("Agora, do minuto atual, estamos no " + calendario.get(Calendar.SECOND) + "� segundo.");
	}
}
