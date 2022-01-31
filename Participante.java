package Reality;

import java.util.ArrayList;

import Reality.Criterio.Criterio;

public class Participante extends ElemAbstracto{

	private String apellido;
	private int edad;
	private ArrayList<String> generosPreferencia;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;
	
	public Participante(String nombre, String apellido, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.edad = edad;
		generosPreferencia = new ArrayList<>();
		idiomas = new ArrayList<>();
		instrumentos = new ArrayList<>();
	}
	
	public void addGenero(String g) {
		this.generosPreferencia.add(g);
	}
	public void addIdiomas(String id) {
		this.idiomas.add(id);
	}
	public void addInstrumento(String i) {
		this.instrumentos.add(i);
	}
	
	public boolean equals(Object o) {
		try {
			Participante aux = (Participante) o;
			if(aux.getNombre().equals(this.getNombre()) && 
					aux.getApellido().equals(this.getApellido())) {
				return true;
			}else {
				return false;
			}

		}catch(Exception e) {
			return false;
		}
	}
	
	
	
	@Override
	public ArrayList<String> getGenerosPreferencia() {
		return new ArrayList<>(generosPreferencia);
	}
	@Override
	public ArrayList<String> getIdiomas() {
		return new ArrayList<>(idiomas);
	}
	@Override
	public ArrayList<String> getInstrumentos() {
		return new ArrayList<>(instrumentos);
	}
	
	@Override
	public int cantParticipante() {
		return 1;
	}
	
	@Override
	public ArrayList<ElemAbstracto> buscar(Criterio c) {
		ArrayList<ElemAbstracto> resultado = new ArrayList<>();
		if(c.cumple(this)) {
			resultado.add(this);
		}
		return resultado;
	}
	@Override
	public int cantParticipanteTocanInstrumento(String instrumento) {
		if(this.getInstrumentos().contains(instrumento)) {
			return 1;
		}
		return 0;
	}
		
	@Override
	public double getEdad() {
		return edad;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		return "Participante [ "+nombre +" "+edad+": generosPreferencia=" + generosPreferencia + ", idiomas=" + idiomas + ",instrumentos="
				+ instrumentos + "]" + "\n";
	}



	
}
