package krastines.trysKlases;

import java.io.IOException;
import java.util.ArrayList;

public class IsTestinio {
	
		public Double [] reiksmes;
	
		public IsTestinio() {}

		public void Testinis() {
		
			reiksmes =  new Double [] {7.00, 88.00, 9.00, 662.01, 5.42};
		}
		public Double [] atiduokReiksmes() throws IOException{
			Testinis();
			System.out.println("imu testines reiksmes");
			return reiksmes;
			
		}
		public void surasyti() {
			System.out.print("Testas ");
			for(int i=0;i<reiksmes.length;i++) {
				System.out.print(reiksmes[i]+" ");
			}
		}
}