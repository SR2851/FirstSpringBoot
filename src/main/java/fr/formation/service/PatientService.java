package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Patient;
import fr.formation.repository.IPatientRepository;
@Service
public class PatientService implements IPatientService {
@Autowired
	IPatientRepository patientRepository;
	
	@Override
	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public int createPatient(Patient patient) {
		patientRepository.save(patient);
		return 1;
	}

	@Override
	public Patient getPatient(long idPatient) {
		Optional<Patient> oppatient = patientRepository.findById(idPatient);
		Patient patient = oppatient.get();
		return patient;
	}

	@Override
	public Boolean deletePatient(long idPatient) {
		try {
			patientRepository.deleteById(idPatient);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	

}
