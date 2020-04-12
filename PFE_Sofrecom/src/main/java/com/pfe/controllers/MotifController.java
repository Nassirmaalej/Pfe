package com.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.entities.Motif;
import com.pfe.entities.Rule;
import com.pfe.serviceimpl.MotifServiceImpl;
import com.pfe.serviceimpl.RuleServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/motif")
@ResponseBody
public class MotifController {
	@Autowired
	private MotifServiceImpl motifservice;
	
	
	
	@GetMapping("/liste")
	public List<Motif> findAll() {
		try {
			return motifservice.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	@GetMapping("/Assistancecommerciale")
public int Assistancecommerciale() throws Exception {
			return motifservice.Assistancecommerciale();
	}
	@GetMapping("/Activationweb")
public int Activationweb() throws Exception {
			return motifservice.Activationweb();
	}
	
	@GetMapping("/Assurancemobile")
public int Assurancemobile() throws Exception {
			return motifservice.Assurancemobile();
	}
	
	@GetMapping("/Desimlockage")
public int Desimlockage() throws Exception {
			return motifservice.Desimlockage();
	}
	@GetMapping("/Paiementfacture")
public int Paiementfacture() throws Exception {
			return motifservice.Paiementfacture();
	}
	@GetMapping("/Informationsurlaconsommation")
public int Informationsurlaconsommation() throws Exception {
			return motifservice.Informationsurlaconsommation();
	}
	@GetMapping("/Choixintermédairenonvalide")
public int Choixintermédairenonvalide() throws Exception {
			return motifservice.Choixintermédairenonvalide();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
