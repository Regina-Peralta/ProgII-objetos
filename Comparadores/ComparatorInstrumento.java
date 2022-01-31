package Reality.Comparadores;

import java.util.Comparator;

import Reality.ElemAbstracto;

public class ComparatorInstrumento implements Comparator<ElemAbstracto>{

	public ComparatorInstrumento() {
		
	}
	
	@Override
	public int compare(ElemAbstracto o1, ElemAbstracto o2) {
		int e1 = o1.getInstrumentos().size();
		int e2 = o2.getInstrumentos().size();
		
		return e1 - e2;
		
	
	}

}
