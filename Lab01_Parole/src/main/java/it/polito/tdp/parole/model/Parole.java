package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
		//COmm
	private List <String> listaParole;
	
	public Parole() {
		//TODO
		listaParole = new LinkedList<String>();
		
	}
	
	public void addParola(String p) {
		//TODO
		listaParole.add(p);
		
	}
	
	public List<String> getElenco() {
		
		//TODO
		
		Collections.sort(listaParole);
		
		return listaParole;
	}
	
	public void reset() {
		// TODO
		listaParole.clear();
	}
	public String toString() {
		String s="";
		for(String tempS: this.getElenco())
			if(s.compareTo("")==0)
				s+= tempS;
			else
				s+= " "+tempS;
		
		return s;
	}

	public void delete(String daCancellare) {
		
		listaParole.remove(daCancellare);
		
		
	}
}
