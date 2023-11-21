package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private int antall;
	private Innlegg[] samling;

	public Blogg() {
		samling = new Innlegg[20];
		antall = 0;
	}

	public Blogg(int lengde) {
		samling = new Innlegg[lengde];
	}

	public int getAntall() {
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return samling;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int indexPos = -1;
		
		for(int i = 0; i < antall; i++) {
			if(this.samling[i].erLik(innlegg)) {
				indexPos = i;
			}
		}
		return indexPos;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnesInnlegg = false;
		for(int i = 0; i < antall; i++) {
			if(this.samling[i].erLik(innlegg)) {
				finnesInnlegg = true;
			}
		}
		return finnesInnlegg;
	}

	public boolean ledigPlass() {
		boolean erPlass = false;
		if(antall < samling.length) {
			erPlass = true;
		}
		return erPlass;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(ledigPlass()) {
			samling[antall] = innlegg;
			antall++;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String bloggString = antall + "\n";
		
		for(int i = 0; i < antall; i++) {
			bloggString += samling[i].toString();
		}
		return bloggString;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}