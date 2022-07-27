package model;

public class Computador {
	private String fabricante;
	private String processador;
	private String memoriaPrincipal;
	private String memoriaSecundaria;
	
	public Computador() {
		
	}
	
	public Computador(String fab, String proc, String memP, String memS) {
		this.fabricante = fab;
		this.processador = proc;
		this.memoriaPrincipal = memP;
		this.memoriaSecundaria = memS;
	}

	public String getFabricante() {
		return fabricante;
	}


	public String getProcessador() {
		return processador;
	}

	public void trocarProcessador(String processador) {
		this.processador = processador;
	}

	public String getMemoriaPrincipal() {
		return memoriaPrincipal;
	}

	public void trocarMemoriaPrincipal(String memoriaPrincipal) {
		this.memoriaPrincipal = memoriaPrincipal;
	}

	@Override
	public String toString() {
		return "Computador [fabricante=" + fabricante + ", processador=" + processador + ", memoriaPrincipal="
				+ memoriaPrincipal + ", memoriaSecundaria=" + memoriaSecundaria + "]";
	}

	public String getMemoriaSecundaria() {
		return memoriaSecundaria;
	}

	public void trocarMemoriaSecundaria(String memoriaSecundaria) {
		this.memoriaSecundaria = memoriaSecundaria;
	}
	
	
	
}
