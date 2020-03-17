package fr.formation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.model.Hopital;
import fr.formation.repository.IHopitalRepository;
import fr.formation.service.HopitalService;
import fr.formation.service.IHopitalService;

@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		IHopitalService hopitalserv = new HopitalService();	
		Hopital hopital = new Hopital("Robert Debré", "Chartres", "15 rue des Marroniers", 500);
		hopitalserv.createHopital(hopital);
		
	}

}
