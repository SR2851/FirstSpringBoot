package fr.formation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.model.Hopital;

public interface IHopitalService {

	public List<Hopital> getHopitals();
	public int createHopital(Hopital hopital);
	public Hopital getHopital(long idHopital);
	public Boolean deleteHopital(long idHopital);
	
	
}
