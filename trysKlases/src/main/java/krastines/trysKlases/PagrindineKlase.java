package krastines.trysKlases;

import java.io.IOException;

public class PagrindineKlase {
	
	public Double[] atkarpos;
	
	public PagrindineKlase() {
		
	}
	
	public PagrindineKlase(IsTestinio duomenu_pasiemimas) throws IOException {
		System.out.println("imam duomenis");
		atkarpos = duomenu_pasiemimas.atiduokReiksmes();
	}
	
	public void parodykAtkarpas() {
		for(int i=0;i<atkarpos.length;i++) {
			System.out.print(atkarpos[i]+" ");
		}
	}
}
