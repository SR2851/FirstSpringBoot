package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Hopital;
import fr.formation.service.IHopitalService;

@RestController
@RequestMapping("hopital") //URL du webservice, chemin vers cette classe controller
public class HopitalController {
	@Autowired
	IHopitalService hopitalService;

	@GetMapping("/all")
	public List<Hopital> getAll(){
		return hopitalService.getHopitals();
	}
	
	@GetMapping("/findById/{idHopital}")
	public Hopital getById(@PathVariable long idHopital) {
		return hopitalService.getHopital(idHopital);
		
	}
	
	@PostMapping("/create")
	 public Hopital create(@RequestBody Hopital hopital){
		
		return hopitalService.createHopital(hopital);
	  
	 }
	@DeleteMapping("/delete/{idHopital}")
	public Boolean deleteById(@PathVariable long idHopital) {
		return hopitalService.deleteHopital(idHopital);
	}
	
	@PutMapping("/update")
	 public Hopital update(@RequestBody Hopital hopital){
		
		return hopitalService.updateHopital(hopital);
	  
	 }

	
}
