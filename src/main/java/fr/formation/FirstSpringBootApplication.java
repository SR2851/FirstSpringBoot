package fr.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.model.Hopital;
import fr.formation.model.Medecin;
import fr.formation.model.Patient;
import fr.formation.repository.IHopitalRepository;
import fr.formation.service.HopitalService;
import fr.formation.service.IHopitalService;
import fr.formation.service.IMedecinService;
import fr.formation.service.IPatientService;

@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {
@Autowired
	IHopitalService hopitalService;
@Autowired
IMedecinService medecinService;
@Autowired
IPatientService patientService;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		//Hopital hopital = new Hopital();
		//hopital.setIdHopital(4);
		
		Medecin medecin = new Medecin();
		medecin.setIdMedecin(12);
		//medecin.setNomMedecin("Dumas");
		//medecin.setPrenomMedecin("Laurent");
		//medecin.setSpecialite("Gynechologue");
		//medecin.setHopital(hopital);
		//medecinService.deleteMedecin(11);
		
		Patient patient=new Patient();
		patient.setNomPatient("Maurel");
		patient.setPrenomPatient("Camille");
		patient.setMaladie("Accouchement");
		patient.setIdPatient(15);
		patient.setMedecin(medecin);
		patientService.createPatient(patient);
		
		
	}

}
