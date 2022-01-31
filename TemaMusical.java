package Reality;

import java.util.ArrayList;

import Reality.Criterio.Criterio;

public class TemaMusical {

	private String titulo;
	private String idioma;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> instrumentos;
	private Criterio criterio;
	
	public TemaMusical(String titulo, String idioma, Criterio criterio) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.criterio = criterio;
		generosMusicales = new ArrayList<>();
		instrumentos = new ArrayList<>();
	}

	public boolean puedeSerInterpretado(ElemAbstracto e) {
		if(criterio.cumple(e)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void addGeneroMusica(String g) {
		this.generosMusicales.add(g);
	}
	
	public void addInstrumento(String i) {
		this.instrumentos.add(i);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public ArrayList<String> getGenerosMusicales() {
		return new ArrayList<>(generosMusicales);
	}

	public ArrayList<String> getInstrumentos() {
		return new ArrayList<>(instrumentos);
	}
	
/*		
	public Criterio getCriterio() {
		return criterio;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
*/
	
	@Override
	public boolean equals(Object o) {
		try {
			TemaMusical temaMusical = (TemaMusical) o;
			return this.getTitulo().equalsIgnoreCase(temaMusical.getTitulo()) &&
					this.getIdioma().equalsIgnoreCase(temaMusical.getIdioma());
		}catch(Exception e) {
			return false;
		}
	}
	
}
