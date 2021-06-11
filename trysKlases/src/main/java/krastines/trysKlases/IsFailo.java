package krastines.trysKlases;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class IsFailo extends IsTestinio {
	
	public IsFailo() {
		super();
	}
	
	public void nuskaitytiFaila() throws IOException {
		File is_failo = new File("C:\\Users\\Mokinys\\Desktop\\darbai\\trysKlases\\isFailo.csv");
		BufferedReader sarasas = new BufferedReader( new FileReader( is_failo ) );
		
		String atkarpa;	
		String []reiksmes_skaidom;
		
		if ((atkarpa = sarasas.readLine()) !=null){
			
			reiksmes_skaidom = atkarpa.split(";");	
			reiksmes= new Double[reiksmes_skaidom.length];
			for(int i=0;i<reiksmes_skaidom.length;i++) {
				reiksmes[i]=Double.parseDouble(reiksmes_skaidom[i]);
			}
		}
		sarasas.close();
	}
	
	public Double[] atiduokReiksmes ()throws IOException {
		System.out.println("failas skaitomas");
		nuskaitytiFaila();
		System.out.println("failas nuskaitytas");
		return reiksmes;
	}
}
		
	