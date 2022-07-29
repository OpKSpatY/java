package model;

public class ComputadorDeMesa extends Computador{
	private String fabricanteGabinete;
	private String tipoGabinete;
	private String fonte;
	
	public ComputadorDeMesa() {
		
	}
	
	public ComputadorDeMesa(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria
			, String fabricanteGabinete, String tipoGabinete, String fonte) {
		super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
		this.fabricanteGabinete = fabricanteGabinete;
		this.fonte = fonte;
		this.tipoGabinete = tipoGabinete;
	}
	
	public void trocarFabricanteGabinete(String fabGabinete) {
		this.fabricanteGabinete = fabGabinete;
	}
	
	public void trocarTipoGabinete(String gabinete) {
		this.tipoGabinete = gabinete;
	}

	public String getFabricanteGabinete() {
		return fabricanteGabinete;
	}

	@Override
	public String toString() {
		return "ComputadorDeMesa [fabricanteGabinete=" + fabricanteGabinete + ", tipoGabinete=" + tipoGabinete
				+ ", fonte=" + fonte + "]" + super.toString();
	}

	public String getTipoGabinete() {
		return tipoGabinete;
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}
	
}
