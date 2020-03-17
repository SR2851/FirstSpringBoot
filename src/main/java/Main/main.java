package Main;

import org.springframework.boot.SpringApplication;

import fr.formation.model.Hopital;
import fr.formation.service.HopitalService;
import fr.formation.service.IHopitalService;

public class main {
	public static void main(String[] args) {
		
	

HopitalService hopitalserv = null;	
Hopital hopital = new Hopital("Robert Debré", "Chartres", "15 rue des Marroniers", 500);
hopitalserv.createHopital(hopital);
}
}
