package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import fr.formation.model.Medecin;

import fr.formation.service.IMedecinService;

@RestController
@RequestMapping("medecin") 
public class MedecinController {
	@Autowired
	IMedecinService medecinService;

	@GetMapping("/all")
	public List<Medecin> getAll(){
		return medecinService.getMedecins();
	}
	
	@GetMapping("/findById/{idMedecin}")
	public Medecin getById(@PathVariable long idMedecin) {
		return medecinService.getMedecin(idMedecin);
		
	}
}
