package Reality;

import java.util.ArrayList;

import Reality.Criterio.Criterio;

public class Grupo extends ElemAbstracto{

	protected ArrayList<ElemAbstracto> elementos;
	
	public Grupo(String nombre) {
		super(nombre);
		elementos = new ArrayList<>();
	}

	public void add(ElemAbstracto p) {
		this.elementos.add(p);
	}
	
	@Override
	public double getEdad() {
	double total = 0.0;
		 for (ElemAbstracto elem : elementos) {
			total += elem.getEdad();
		 }
	return total/this.cantParticipante();
	}
	
	@Override
	public int cantParticipante() {
	int total = 0;
		 for (ElemAbstracto elem : elementos) {
			total += elem.cantParticipante();
		 }
	return total;
	}
	
	
	@Override
	public ArrayList<String> getGenerosPreferencia(){
		ArrayList<String> generosComun = elementos.get(0).getGenerosPreferencia();
		for (ElemAbstracto e : elementos) {
			generosComun.retainAll(e.getGenerosPreferencia());
		}
		return generosComun;
	}

	@Override
	public ArrayList<String> getIdiomas(){
        ArrayList<String> listaIdioma = new ArrayList<>();
        for (ElemAbstracto elemAbstracto : elementos) {
        	ArrayList<String> listaParticipante = elemAbstracto.getIdiomas();
        	for (String idioma : listaParticipante) {
				if(!listaIdioma.contains(idioma)) {
					listaIdioma.add(idioma);
				}
			}
		}
        return listaIdioma;
    }
	@Override
	 public ArrayList<String> getInstrumentos(){
	        ArrayList<String> listaInstrumentos = new ArrayList<>();
	        for (ElemAbstracto elemAbstracto : elementos) {
	        	ArrayList<String> listaParticipante = elemAbstracto.getInstrumentos();
	        	for (String instrumento : listaParticipante) {
					if(!listaInstrumentos.contains(instrumento)) {
						listaInstrumentos.add(instrumento);
					}
				}
			}
	        return listaInstrumentos;
	    }

	@Override
	public ArrayList<ElemAbstracto> buscar(Criterio c) {
		ArrayList<ElemAbstracto> resultado = new ArrayList<>();
		if(c.cumple(this)) {
			 resultado.add(this);
		}else {
			for(ElemAbstracto e: elementos) {
			 resultado.addAll(e.buscar(c));
			}
		}
		 return resultado;
	}
	@Override
	public int cantParticipanteTocanInstrumento(String instrumento) {
		int total = 0;
		for (ElemAbstracto elemAbstracto : elementos) {
			total += elemAbstracto.cantParticipanteTocanInstrumento(instrumento);
		}
		return total;
	}

	@Override
	public String toString() {
		return "Grupo ["+ nombre + "="  + elementos + "]" + "\n";
	}


				
	
}
