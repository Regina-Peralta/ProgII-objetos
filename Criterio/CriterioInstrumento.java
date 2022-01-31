package Reality.Criterio;
import Reality.ElemAbstracto;


public class CriterioInstrumento extends Criterio{

	private String instrumentoBuscado;
	
	public CriterioInstrumento(String instrumentoBuscado) {
		this.instrumentoBuscado = instrumentoBuscado;
	}
	

	@Override
	public boolean cumple(ElemAbstracto p) {
		return p.tieneInstrumento(instrumentoBuscado);
	}

	public String getInstrumentoBuscado() {
		return instrumentoBuscado;
	}
	
	public void setInstrumentoBuscado(String instrumentoBuscado) {
		this.instrumentoBuscado = instrumentoBuscado;
	}


}
