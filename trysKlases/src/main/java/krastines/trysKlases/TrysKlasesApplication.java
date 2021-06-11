package krastines.trysKlases;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrysKlasesApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(TrysKlasesApplication.class, args);
		
		System.out.println("Pradedame");
		
		//IsTestinio testas = new IsTestinio();    //veikia
		//testas.Testinis();						//veikia
		
		//IsFailo failo = new IsFailo();			//veikia
		
		IsIvedimo ivesk = new IsIvedimo();		//pabaigti 
		
		PagrindineKlase pagrindine_klase = new PagrindineKlase(ivesk);  //pakeisti (cia) pagal norima klase
		pagrindine_klase.parodykAtkarpas();
	}

}
