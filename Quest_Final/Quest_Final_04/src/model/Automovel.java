package model;

public class Automovel {
	private Cambio cambio;
	
	public Automovel() {
		
	}
	
	public void aumentarMarcha() {
		int marcha = this.cambio.getMarcha();
		cambio.setMarcha(marcha++);
	}
	
}
