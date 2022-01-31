package Reality;

import Reality.Comparadores.*;
import Reality.Criterio.*;

public class Main {
	public static void main(String[] args) {
		
		
		Coach c = new Coach();
		
		Participante p = new Participante("p1","sa",40);
		Participante p2 = new Participante("p2","p2",40);
		Participante p3 = new Participante("p3","f",40);
		Participante p4 = new Participante("p4","f",10);
		
		p.addInstrumento("bateria");
		//p2.addInstrumento("guitarra");
		p2.addInstrumento("piano");
		p2.addInstrumento("flauta");
		//p2.addInstrumento("bateria");
		
		p3.addInstrumento("flauta");
		p4.addInstrumento("piano");
		p4.addInstrumento("flauta");
		
		p.addIdiomas("español");
		p.addIdiomas("ingles");
		p2.addIdiomas("ingles");
		p2.addIdiomas("portugues");
		p3.addIdiomas("ingles");
		p4.addIdiomas("italiano");
		p4.addIdiomas("portugues");
		
		p.addGenero("pop");
		p.addGenero("blues");
		p4.addGenero("rock");
		p3.addGenero("cumbia");
		
		
		
		Grupo gr3= new Grupo("grupo 3");
		Grupo gr4= new Grupo("grupo 4");
		
		gr3.add(p);
		gr3.add(p2);
		
		gr4.add(p3);
		gr4.add(p4);
		
		//gr3.add(gr4);
		

		c.add(gr3);
		c.add(gr4);
		ComparatorEdad ci = new ComparatorEdad();
		ComparatorInstrumento cinst = new ComparatorInstrumento();
		ComparadorInverso cinv = new ComparadorInverso(ci);
		ComparadorCompuesto cc =new ComparadorCompuesto(ci,cinst);
		//System.out.println(c.batalla(cinst));
		//c.add(p3);
		//c.add(gr4);
		//c.add(p3);
		//c.add(p4);
		
		//System.out.println(c.getIdiomas());
		//System.out.println(gr3.getIdiomas());
		
		CriterioIdioma idioma1 = new CriterioIdioma("ingles");
		//System.out.println(c.buscar(idioma1));
		//System.out.println(gr3.buscar(idioma1));
		
		//System.out.println(c.getListadoInstrumentos());
		//System.out.println(c.getListadoIdiomas());
		//System.out.println(c.getListadoGeneros());
		
		System.out.println("-----------");
		
		CriterioIdioma idioma = new CriterioIdioma("ingles");
		CriterioIdioma idioma2 = new CriterioIdioma("español");
		CriterioAnd criterioAndIdiomas = new CriterioAnd(idioma,idioma2);
		CriterioInstrumento instr = new CriterioInstrumento("bateria");
		CriterioAnd criterioAnd = new CriterioAnd(criterioAndIdiomas,instr);
		
		CoachExigente couchExi = new CoachExigente(criterioAnd);

		couchExi.add(p);
		couchExi.add(p2);
		couchExi.add(p3);
		couchExi.add(p4);
		
		
		//ArrayList<Participante> resultado = new ArrayList<>();
		//resultado = couchExi.buscar(new CriterioAnd(idioma,instr));
		//		System.out.println(resultado);

		//System.out.println(c.getPromedioEdad());
		//System.out.println(couchExi.getPromedioEdad());
		//System.out.println(c.tieneInstrumentos(p2));
		//System.out.println(c.todosLosTrabajos(p));
		//System.out.println(c.mostrarInstrumentos());
		
	
		//Collections.sort(participantes,ci);
		
		//System.out.println(p.getInstrumento());
		
		Grupo gr1= new Grupo("grupo 1");
		Grupo gr2= new Grupo("grupo 2");
		
		Participante p5 = new Participante("p4","f",30);
		Participante p6 = new Participante("p4","f",50);
		Participante p7 = new Participante("p4","f",10);
		
		Participante p8 = new Participante("p4","f",20);
		Participante p9 = new Participante("p4","f",10);
		//System.out.println(p5.getEdad());
		
		
		p5.addGenero("g1");//
		p5.addGenero("g2");
		p5.addGenero("g3");
		p5.addGenero("g4");//
		p5.addGenero("g5");
		
		
		p7.addGenero("g1");//
		p7.addGenero("g4");//
		p7.addGenero("g11");
		p7.addGenero("g5");//
		
		//p8.addGenero("g1");
		//p8.addGenero("g11");//
		p8.addGenero("g5");//
		//p8.addGenero("g1");
		
		p9.addGenero("g5");//
		
		//gr1.addNuevoParticipante(p6);
		gr1.add(p5);
		gr1.add(p7);
		//gr1.add(p8);
		
		gr2.add(p8);
		gr2.add(p9);
		
		//gr1.add(gr2);
		
		//System.out.println(gr1.getGenerosPreferencia());
		//System.out.println(gr2.getGenerosPreferencia());
		//System.out.println(gr1.getIdiomas());
		
		
		
		//ComparatorInstrumento temaCriterio = new ComparatorInstrumento();
		CriterioInstrumento temaCriterio = new CriterioInstrumento("guitarra");
		CriterioIdioma temaIdioma = new CriterioIdioma("ingles");
		TemaMusicalFinal tmf = new TemaMusicalFinal("tema2", "Español",temaIdioma,2);
		//TemaMusical tmf = new TemaMusical("tema1", "Español",temaCriterio);
		
		p5.addIdiomas("ingles");
		p7.addIdiomas("ingles");
		tmf.addInstrumento("guitarra");
		tmf.addInstrumento("bateria");
		//tmf.addInstrumento("piano");
		
		p5.addInstrumento("piano");
		p5.addInstrumento("piano");
		
		p7.addInstrumento("guitarra");
		p7.addInstrumento("bateria");
		
	
		//p7.addInstrumento("piano");
		//tmf.puedeSerInterpretado(gr1);
		System.out.println(tmf.puedeSerInterpretado(gr1));

		
		//System.out.println(tmf.getCantMiembros());
		//System.out.println(gr1.cantParticipante());
		
		p8.addInstrumento("guitarra");
		p9.addInstrumento("bateria");
		p9.addInstrumento("guitarra");
		
		Reality r = new Reality();
		Coach c1 = new Coach();
		r.addCouch(c1);
		c1.add(gr1);
		r.addParticipante(gr1);
		r.addParticipante(gr2);
		//System.out.println(r.batalla(temaCriterio));
		
		//System.out.println(r.ganadorBatalla(ci, gr1, gr2));
		//System.out.println(c1.rankingBatalla(ci));
	}
}
