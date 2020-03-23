package fr.formation.service;

import java.util.List;

import fr.formation.model.Hopital;
import fr.formation.model.Medecin;

public interface IMedecinService {
	public List<Medecin> getMedecins();
	public Medecin createMedecin(Medecin medecin);
	public Medecin getMedecin(long idMedecin);
	public Boolean deleteMedecin(long idMedecin);
	public Medecin updateMedecin(Medecin medecin);
	public Medecin medHopital(Medecin medecin);
}
