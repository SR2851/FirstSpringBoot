package fr.formation.service;

import java.util.List;

import fr.formation.model.Medecin;

public interface IMedecinService {
	public List<Medecin> getMedecins();
	public int createMedecin(Medecin medecin);
	public Medecin getMedecin(long idMedecin);
	public int deleteMedecin(long idMedecin);
	
}
