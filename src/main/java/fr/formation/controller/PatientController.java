package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Hopital;
import fr.formation.model.Medecin;
import fr.formation.model.Patient;
import fr.formation.service.IMedecinService;
import fr.formation.service.IPatientService;

@RestController
@RequestMapping("patient") 
@CrossOrigin("http://localhost:4200")
public class PatientController {
	@Autowired
	IPatientService patientService;
	@Autowired
	IMedecinService medecinService;

	@GetMapping("/all")
	public List<Patient> getAll(){
		return patientService.getPatients();
	}
	
	@GetMapping("/findById/{idPatient}")
	public Patient getById(@PathVariable long idPatient) {
		return patientService.getPatient(idPatient);
		
	}
	
	@PostMapping("/create")
	 public Patient create(@RequestBody Patient patient){
		
		return patientService.createPatient(patient);
	  
	 }
	@DeleteMapping("/delete/{idPatient}")
	public Boolean deleteById(@PathVariable long idPatient) {
		return patientService.deletePatient(idPatient);
	}
	
	@PutMapping("/update/{idPatient}")
	 public Patient update(@PathVariable long idPatient, @RequestBody Patient patient){
		Patient pat1= patientService.getPatient(idPatient);
		pat1.setMaladie(patient.getMaladie());
		pat1.setNomPatient(patient.getNomPatient());
		pat1.setPrenomPatient(patient.getPrenomPatient());
		pat1.setMedecin(patient.getMedecin());
		return patientService.updatePatient(pat1);
	  
	 }
	
	@PutMapping("/medpatient/{idPatient}/{idMedecin}")
	 public Patient MedHopital(@PathVariable long idPatient, @PathVariable long idMedecin){
		Medecin med1= medecinService.getMedecin(idMedecin);
		Patient pat1=patientService.getPatient(idPatient);
		pat1.setMedecin(med1);
		
		return patientService.createPatient(pat1);
	  
	 }
}
