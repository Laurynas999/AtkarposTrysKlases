package krastines.trysKlases;

import java.util.ArrayList;
import java.util.Scanner;

public class IsIvedimo extends IsTestinio{
	
	public IsIvedimo(){
		super();
	}
	
	/***
	 *   Pabaigti reikia
	 */

	public void isKlaviaturos () {
		System.out.println("Įveskite atkarpą :");
		Scanner ivedame_atkarpas = new Scanner(System.in);
		Double nuskaityta_atkarpa = ivedame_atkarpas.nextDouble();
		Double reiksmes[];
		int n = 0;
		
		while (nuskaityta_atkarpa!=0) {

			System.out.println("Įveskite kitą atkarpą :");
			reiksmes[n] =nuskaityta_atkarpa;
			n++;
			nuskaityta_atkarpa = ivedame_atkarpas.nextDouble();	

		}
		ivedame_atkarpas.close();
	}
	
	public Double[] atiduokReiksmes(){
		isKlaviaturos();
		return reiksmes;
	}
		
}
