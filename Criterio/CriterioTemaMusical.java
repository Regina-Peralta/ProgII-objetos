package Reality.Criterio;

import Reality.ElemAbstracto;
import Reality.TemaMusical;

public class CriterioTemaMusical extends Criterio {

	private TemaMusical temaBuscado;
	
	public CriterioTemaMusical(TemaMusical temaBuscado) {
		this.temaBuscado = temaBuscado;
	}

	@Override
	public boolean cumple(ElemAbstracto e) {
		return temaBuscado.puedeSerInterpretado(e);
	}

}
