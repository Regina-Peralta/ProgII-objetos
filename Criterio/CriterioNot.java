package Reality.Criterio;
import Reality.ElemAbstracto;


public class CriterioNot extends Criterio {
	
	private Criterio criterio;
	
	public CriterioNot(Criterio criterio) {
		this.criterio = criterio;
	}
	@Override
	public boolean cumple(ElemAbstracto p) {
		return !this.criterio.cumple(p);
	}

}
