package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private int likes;
	private String bruker;
	private String dato;
	
	public Innlegg() {
		
	}
	
	
	public Innlegg(int id, String bruker, String dato) {

		likes = 0;
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		return bruker;
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		return id == innlegg.id;

	}
	
	@Override
	public String toString() {
		
		String tilStreng = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		return tilStreng;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
