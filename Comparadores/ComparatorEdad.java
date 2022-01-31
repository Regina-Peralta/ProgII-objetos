package Reality.Comparadores;

import java.util.Comparator;

import Reality.ElemAbstracto;

public class ComparatorEdad implements Comparator<ElemAbstracto>{

	public ComparatorEdad() {
		
	}
	@Override
	public int compare(ElemAbstracto o1, ElemAbstracto o2) {
		double  d1 = o1.getEdad();
		double d2 = o2.getEdad();
		 if (d1 > d2 ) {
			 return 1;
		 } else if (d2 > d1){
				 return  -1;
		 } else {
				 return 0;
			 }
		 
	}

}
