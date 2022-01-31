package Reality.Criterio;

import Reality.ElemAbstracto;


public class CriterioGenero extends Criterio{
	
	private String generoBuscado;
	
	public CriterioGenero(String generoBuscado) {
		this.generoBuscado = generoBuscado;
	}

	@Override
	public boolean cumple(ElemAbstracto p) {
		return p.tieneGeneros(generoBuscado);
	}

	public String getGeneroBuscado() {
		return generoBuscado;
	}
	
	public void setGeneroBuscado(String generoBuscado) {
		this.generoBuscado = generoBuscado;
	}
}
