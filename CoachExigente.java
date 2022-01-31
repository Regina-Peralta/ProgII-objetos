package Reality;

import Reality.Criterio.Criterio;

public class CoachExigente extends Coach {

	private Criterio criterio;

	public CoachExigente(Criterio criterio) {
		this.criterio = criterio;
	}

	public void add(ElemAbstracto p) {
		if(criterio.cumple(p)) {
			this.equipo.add(p);
		}
	}
	
	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
}
