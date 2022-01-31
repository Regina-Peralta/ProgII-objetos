package Reality.Comparadores;

import java.util.Comparator;

import Reality.ElemAbstracto;

public class ComparadorInverso implements Comparator<ElemAbstracto>{

	private Comparator<ElemAbstracto> directo;
	
	public ComparadorInverso(Comparator<ElemAbstracto> directo) {
		this.directo = directo;
	}

	@Override
	public int compare(ElemAbstracto o1, ElemAbstracto o2) {
		return -directo.compare(o1, o2) ;
	}

}
