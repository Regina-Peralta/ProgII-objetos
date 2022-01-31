package Reality;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Reality.Criterio.Criterio;

public class Coach {

	protected ArrayList<ElemAbstracto> equipo;
	
	public Coach() {
		equipo =  new ArrayList<>();

	}

	public void add(ElemAbstracto p) {
		this.equipo.add(p);
	}
	
	public double getEdad() {
		double total = 0.0;
			 for (ElemAbstracto elem : equipo) {
				total += elem.getEdad();
			 }
		return total/equipo.size();
	}
	
	public ArrayList<String> getIdiomas(){
        ArrayList<String> listaIdioma = new ArrayList<>();
        for (ElemAbstracto elemAbstracto : equipo) {
        	ArrayList<String> listaParticipante = elemAbstracto.getIdiomas();
        	for (String idioma : listaParticipante) {
				if(!listaIdioma.contains(idioma)) {
					listaIdioma.add(idioma);
				}
			}
		}
        return listaIdioma;
    }
	
	 public ArrayList<String> getInstrumentos(){
	        ArrayList<String> listaInstrumentos = new ArrayList<>();
	        for (ElemAbstracto elemAbstracto : equipo) {
	        	ArrayList<String> listaParticipante = elemAbstracto.getInstrumentos();
	        	for (String instrumento : listaParticipante) {
					if(!listaInstrumentos.contains(instrumento)) {
						listaInstrumentos.add(instrumento);
					}
				}
			}
	        
	        return listaInstrumentos;
	    }
	 
	 
	 public ArrayList<String>  getGenerosPreferencia(){
	        ArrayList<String> listaGeneros = new ArrayList<>();
	        for (ElemAbstracto p : equipo) {
	        	ArrayList<String> listaParticipante = p.getGenerosPreferencia();
	        	for (String genero : listaParticipante) {
					if(!listaGeneros.contains(genero)) {
						listaGeneros.add(genero);
					}
				}
	        }
	        Collections.sort(listaGeneros);
	        return listaGeneros;
	    }
	 
	 
	 public ArrayList<ElemAbstracto> buscar(Criterio c) {
			ArrayList<ElemAbstracto> resultado = new ArrayList<>();		
			
			 for(ElemAbstracto e: equipo) {
				resultado.addAll(e.buscar(c));
			 }
			 return resultado;
		}

	 public ArrayList<ElemAbstracto> rankingBatalla(Comparator<ElemAbstracto> c){
			ArrayList<ElemAbstracto> listadoParticipantes= new ArrayList<>(equipo);
			Collections.sort(listadoParticipantes, c);
			return listadoParticipantes;
		}
	 
	 public ArrayList<ElemAbstracto> getEquipo() {
		 return new ArrayList<>(equipo);
	 }
	 
	 
	 @Override
	 public String toString() {
		 return "Couch [equipo=" + equipo + "]" ;
	 }
	 

	
}
