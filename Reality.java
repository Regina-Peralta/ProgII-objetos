package Reality;

import java.util.ArrayList;
import java.util.Comparator;

import Reality.Criterio.Criterio;

public class Reality {

	private ArrayList<Coach> couches;
	private ArrayList<ElemAbstracto> participantes;
	private ArrayList<TemaMusical> temasMusicales;
		
	public Reality() {
		couches = new ArrayList<>();
		participantes = new ArrayList<>();
		temasMusicales = new ArrayList<>();
	}
		
	public void addCouch(Coach c) {
		this.couches.add(c);
	}
	
	public void addParticipante(ElemAbstracto p) {
		this.participantes.add(p);
	}
	
	public void addTemaMusical(TemaMusical tm) {
		this.temasMusicales.add(tm);
	}
	
	public ArrayList<ElemAbstracto> getElemAbstractoBuscarBatalla(Criterio c) {
		ArrayList<ElemAbstracto> batalla = new ArrayList<>();
		for (Coach couch : couches) {
			ArrayList<ElemAbstracto> cumplenCouch = couch.buscar(c);
			for (ElemAbstracto cumple : cumplenCouch) {
				if(!batalla.contains(cumple)) {
					batalla.add(cumple);
				}
			}
		}
		return batalla;
	}

	public ElemAbstracto ganadorBatalla(Comparator<ElemAbstracto> c, ElemAbstracto e1, ElemAbstracto e2){
		int res = c.compare(e1, e2);
		if (res > 0) {
			return e1;
		}
		if (res < 0) {
			return e2;
		}	
		return null;
	}


	
}
