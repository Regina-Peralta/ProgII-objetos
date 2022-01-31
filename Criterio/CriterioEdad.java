package Reality.Criterio;
import Reality.ElemAbstracto;


public class CriterioEdad extends Criterio{

	private int edadBuscado;
	
	public CriterioEdad(int edadBuscado) {
		this.edadBuscado = edadBuscado;
	}
	
	public int getEdadBuscado() {
		return edadBuscado;
	}

	public void setEdadBuscado(int edadBuscado) {
		this.edadBuscado = edadBuscado;
	}

	@Override
	public boolean cumple(ElemAbstracto p) {
		return p.getEdad() >= edadBuscado;
	}

}
