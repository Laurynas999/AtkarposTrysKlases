package krastines.trysKlases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IsIvedimo extends IsTestinio{
	
	public IsIvedimo(){
		super();
	}
	
	/***
	 *   Pabaigti reikia
	 */

	public void isKlaviaturos () throws IOException{
		
		System.out.println("Įveskite atkarpą :");
		Scanner ivedame_atkarpas = new Scanner(System.in);
		Double[] reiksmesx=  new Double[20];
		Double nuskaityta_atkarpa = ivedame_atkarpas.nextDouble();
		int n = 0;
		
		while (nuskaityta_atkarpa!=0) {

			System.out.println("Įveskite kitą atkarpą :");
			reiksmesx[n] =nuskaityta_atkarpa;
			n++;
			nuskaityta_atkarpa = ivedame_atkarpas.nextDouble();	
			
		}
		reiksmes = new Double [n];
		for(int i=0;i<n;i++) {
			reiksmes[i]=reiksmesx[i];
				System.out.println(reiksmes[i]);
		}
		ivedame_atkarpas.close();
	}
	
	public Double[] atiduokReiksmes() throws IOException{
		isKlaviaturos();
		return reiksmes;
	}
		
}
