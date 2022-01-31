package Reality.Criterio;

import Reality.ElemAbstracto;

public class CriterioIdioma extends Criterio {

	private String idiomaBuscado;
	
	public CriterioIdioma(String idiomaBuscado) {
		this.idiomaBuscado = idiomaBuscado;
	}

	@Override
	public boolean cumple(ElemAbstracto e) {
		return e.tieneIdioma(idiomaBuscado);
	}
	
	
	public String getIdiomaBuscado() {
		return idiomaBuscado;
	}
	
	public void setIdiomaBuscado(String idiomaBuscado) {
		this.idiomaBuscado = idiomaBuscado;
	}

}
