package fr.formation.service;

import java.util.List;

import fr.formation.model.Patient;

public interface IPatientService {
	public List<Patient> getPatients();
	public int createPatient(Patient patient);
	public Patient getPatient(long idPatient);
	public int deletePatient(long idPatient);
	
}
