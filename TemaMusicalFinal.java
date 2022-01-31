package Reality;


import Reality.Criterio.Criterio;

public class TemaMusicalFinal extends TemaMusical {

	private int cantMiembros;
	
	public TemaMusicalFinal(String titulo, String idioma,Criterio criterio,  int cantMiembros) {
		super(titulo, idioma,criterio);
		this.cantMiembros = cantMiembros;
	}
	
	@Override
	public boolean puedeSerInterpretado(ElemAbstracto e) {
		return super.puedeSerInterpretado(e) && this.cumpleCantMiembros(e);
	}
	
	public boolean cumpleCantMiembros(ElemAbstracto e) {
		for (String instrumento : this.getInstrumentos()) {
			int totalParticipantes = e.cantParticipanteTocanInstrumento(instrumento);
			if(totalParticipantes == this.getCantMiembros()) {
				return true;
			}
		}
		return false;
	}
	

	public int getCantMiembros() {
		return cantMiembros;
	}

	public void setCantMiembros(int cantMiembros) {
		this.cantMiembros = cantMiembros;
	}

}
