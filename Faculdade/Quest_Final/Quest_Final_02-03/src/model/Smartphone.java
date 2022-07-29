package model;

public class Smartphone extends Computador{
	private String tamanhoTela;
	private String densidadePixels;
	private String operadora;
	
	public Smartphone(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria
			, String tamanhoTela, String densidadePixels, String operadora) {
		super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
		this.densidadePixels = densidadePixels;
		this.tamanhoTela = tamanhoTela;
		this.operadora = operadora;
	}
	
	public void trocarOperadora(String operadora) {
		this.operadora = operadora;
	}

	@Override
	public String toString() {
		return "Smartphone [tamanhoTela=" + tamanhoTela + ", densidadePixels=" + densidadePixels + ", operadora="
				+ operadora + "]" + super.toString();
	}
}
