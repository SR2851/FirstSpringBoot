package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Hopital;
import fr.formation.model.Medecin;
import fr.formation.repository.IHopitalRepository;
import fr.formation.repository.IMedecinRepository;
@Service
public class MedecinService implements IMedecinService {
@Autowired
	IMedecinRepository medecinRepository;

	
	@Override
	public List<Medecin> getMedecins() {
		// TODO Auto-generated method stub
		return medecinRepository.findAll();
	}

	@Override
	public Medecin createMedecin(Medecin medecin) {
		return medecinRepository.save(medecin);
		
	}

	@Override
	public Medecin getMedecin(long idMedecin) {
		Optional<Medecin> opmedecin =  medecinRepository.findById(idMedecin);
		 Medecin medecin = opmedecin.get();

		return medecin;
	}

	@Override
	public Boolean deleteMedecin(long idMedecin) {
		try {
			medecinRepository.deleteById(idMedecin);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}


	@Override
	public Medecin updateMedecin(Medecin medecin) {
		// TODO Auto-generated method stub
		return medecinRepository.save(medecin);
	}

	@Override
	public Medecin medHopital(Medecin medecin) {
		
		return medecinRepository.save(medecin);
	}

	

}
