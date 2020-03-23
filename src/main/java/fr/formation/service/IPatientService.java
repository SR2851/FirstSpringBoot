package fr.formation.service;

import java.util.List;

import fr.formation.model.Medecin;
import fr.formation.model.Patient;

public interface IPatientService {
	public List<Patient> getPatients();
	public Patient createPatient(Patient patient);
	public Patient getPatient(long idPatient);
	public Boolean deletePatient(long idPatient);
	public Patient updatePatient(Patient patient);
	public Patient medPatient(Patient patient);
}
