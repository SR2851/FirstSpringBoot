package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Hopital;
import fr.formation.repository.IHopitalRepository;
@Service
public class HopitalService implements IHopitalService{
	@Autowired
	IHopitalRepository hopitalRepository;

	public void setHopitalRepository(IHopitalRepository hopitalRepository) {
		this.hopitalRepository = hopitalRepository;
	}

	@Override
	public List<Hopital> getHopitals() {
		return hopitalRepository.findAll();
		 
	}

	@Override
	public Hopital createHopital(Hopital hopital) {
		return hopitalRepository.save(hopital);
		 
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

	@Override
	public Hopital updateHopital(Hopital hopital) {
		// TODO Auto-generated method stub
		return hopitalRepository.save(hopital);
	}

	

	

	

}
