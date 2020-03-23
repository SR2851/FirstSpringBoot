package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Hopital;
import fr.formation.model.Medecin;
import fr.formation.service.IHopitalService;
import fr.formation.service.IMedecinService;

@RestController
@RequestMapping("medecin")
@CrossOrigin("http://localhost:4200")
public class MedecinController {
	@Autowired
	IMedecinService medecinService;
	@Autowired
	IHopitalService hopitalService;

	@GetMapping("/all")
	public List<Medecin> getAll(){
		return medecinService.getMedecins();
	}
	
	@GetMapping("/findById/{idMedecin}")
	public Medecin getById(@PathVariable long idMedecin) {
		return medecinService.getMedecin(idMedecin);
		
	}
	
	@PostMapping("/create")
	 public Medecin create(@RequestBody Medecin medecin){
		
		return medecinService.createMedecin(medecin);
	  
	 }
	@DeleteMapping("/delete/{idMedecin}")
	public Boolean deleteById(@PathVariable long idMedecin) {
		return medecinService.deleteMedecin(idMedecin);
	}
	
	@PutMapping("/update/{idMedecin}")
	 public Medecin update(@PathVariable long idMedecin, @RequestBody Medecin medecin){
		Medecin med1= medecinService.getMedecin(idMedecin);
		med1.setSpecialite(medecin.getSpecialite());
		med1.setNomMedecin(medecin.getNomMedecin());
		med1.setPrenomMedecin(medecin.getPrenomMedecin());
		med1.setHopital(medecin.getHopital());
		return medecinService.updateMedecin(med1);
	  
	 }
	
	@PutMapping("/medhopital/{idMedecin}/{idHopital}")
	 public Medecin MedHopital(@PathVariable long idMedecin, @PathVariable long idHopital){
		Medecin med1= medecinService.getMedecin(idMedecin);
		Hopital hop1=hopitalService.getHopital(idHopital);
		med1.setHopital(hop1);
		
		return medecinService.createMedecin(med1);
	  
	 }
}
