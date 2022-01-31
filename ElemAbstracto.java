package Reality;

import java.util.ArrayList;

import Reality.Criterio.Criterio;

public abstract class ElemAbstracto {

	protected String nombre;
	
	public ElemAbstracto(String nombre) {
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}
	
	public boolean tieneIdioma(String i) {
		if(this.getIdiomas().contains(i)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean tieneGeneros(String g) {
		if(this.getGenerosPreferencia().contains(g)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean tieneInstrumento(String i) {
		if(this.getInstrumentos().contains(i)) {
			return true;
		}
		else {
			return false;
		}
	}
	public abstract double getEdad();
	
	public abstract int cantParticipante();
	
	public abstract ArrayList<String> getGenerosPreferencia();
	public abstract ArrayList<String> getIdiomas();
	public abstract ArrayList<String> getInstrumentos();
	
	public abstract ArrayList<ElemAbstracto> buscar(Criterio c);
	
	public abstract int cantParticipanteTocanInstrumento(String instrumento);
}
