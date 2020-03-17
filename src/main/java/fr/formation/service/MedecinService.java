package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.formation.model.Medecin;
import fr.formation.repository.IMedecinRepository;

public class MedecinService implements IMedecinService {
@Autowired
	IMedecinRepository medecinRepository;
	
	@Override
	public List<Medecin> getMedecins() {
		// TODO Auto-generated method stub
		return medecinRepository.findAll();
	}

	@Override
	public int createMedecin(Medecin medecin) {
		medecinRepository.save(medecin);
		return 1;
	}

	@Override
	public Medecin getMedecin(long idMedecin) {
		Optional<Medecin> opmedecin =  medecinRepository.findById(idMedecin);
		 Medecin medecin = opmedecin.get();

		return medecin;
	}

	@Override
	public int deleteMedecin(long idMedecin) {
		medecinRepository.deleteById(idMedecin);
		return 1;
	}

	

}
