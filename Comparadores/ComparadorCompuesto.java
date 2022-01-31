package Reality.Comparadores;

import java.util.Comparator;

import Reality.ElemAbstracto;

public class ComparadorCompuesto implements Comparator<ElemAbstracto>{

	private Comparator<ElemAbstracto> c1,c2;
	
	public ComparadorCompuesto(Comparator<ElemAbstracto> c1, Comparator<ElemAbstracto> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(ElemAbstracto o1, ElemAbstracto o2) {
		if(c1.compare(o1, o2) == 0 ) {
			return c2.compare(o1, o2);
		}
		return c1.compare(o1, o2);
	}

}
