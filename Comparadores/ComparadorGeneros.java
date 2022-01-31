package Reality.Comparadores;

import java.util.Comparator;

import Reality.ElemAbstracto;

public class ComparadorGeneros implements Comparator<ElemAbstracto>{

	public ComparadorGeneros() {
		
	}
	
	@Override
	public int compare(ElemAbstracto o1, ElemAbstracto o2) {
		int e1 = o1.getGenerosPreferencia().size();
		int e2 = o2.getGenerosPreferencia().size();
		
		return e1 - e2;
	}

}
