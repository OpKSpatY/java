package model;

public class Manual extends Automovel {
	
	private boolean embreagem;
	
	public Manual(boolean embreagem) {
		this.embreagem = embreagem;
	}
	
	public void pisarNaEmbreagem() {
		embreagem = true;
		System.out.println("Voc� est� pisando na embreagem!");
	}
	
	public void soltarEmbreagem() {
		embreagem = false;
		System.out.println("Voc� est� acelerando!");
	}
	
	public void acelerar() {
		if(embreagem = true) {
			System.out.println("Solte a embreagem antes de acelerar!");
		}
		else {
			System.out.println("Voc� est� acelerando!");
		}
	}
}
