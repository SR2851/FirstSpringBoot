package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import fr.formation.model.Hopital;
import fr.formation.repository.IHopitalRepository;

public class HopitalService implements IHopitalService{
	@Autowired
	IHopitalRepository hopitalRepository;

	@Override
	public List<Hopital> getHopitals() {
		return hopitalRepository.findAll();
		 
	}

	@Override
	public int createHopital(Hopital hopital) {
		hopitalRepository.save(hopital);
		return 1;
	}

	@Override
	public Hopital getHopital(long idHopital) {
		Optional<Hopital> ophopital =  hopitalRepository.findById(idHopital);
		Hopital hopital = new Hopital();
		if(ophopital.isPresent()) {
				hopital=ophopital.get();
		}
		return hopital;
	}

	@Override
	public Boolean deleteHopital(long idHopital) {
try {
	hopitalRepository.deleteById(idHopital);
	return true;
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	return false;                 
}       
		
	}

	

	

	

}
