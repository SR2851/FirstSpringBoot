package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Medecin;
import fr.formation.model.Patient;
import fr.formation.service.IMedecinService;
import fr.formation.service.IPatientService;

@RestController
@RequestMapping("patient") 
public class PatientController {
	@Autowired
	IPatientService patientService;

	@GetMapping("/all")
	public List<Patient> getAll(){
		return patientService.getPatients();
	}
	
	@GetMapping("/findById/{idPatient}")
	public Patient getById(@PathVariable long idPatient) {
		return patientService.getPatient(idPatient);
		
	}
}
