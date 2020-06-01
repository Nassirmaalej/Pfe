package com.pfe.controllers;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.dto.StringResponse;
import com.pfe.entities.Rule;
import com.pfe.entities.Utilisateur;
import com.pfe.serviceimpl.RuleServiceImpl;
import com.pfe.serviceimpl.UtilisateurServiceImpl;
@CrossOrigin(origins = "http://localhost:4200")
@RestController

@RequestMapping("/utilisateur")
@ResponseBody
public class UtilisateurController {
	
	@Autowired
	private UtilisateurServiceImpl utilisateurservice;
	

	@GetMapping("/liste")
	public List<Utilisateur> findAll() {
		try {
			return utilisateurservice.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	

	
	@PostMapping("/add")
	
	public StringResponse add( @RequestBody Utilisateur utilisateur) {
		try {
			return utilisateurservice.save(utilisateur);
		} catch (Exception e) {
			e.printStackTrace();
			return new StringResponse(false, "Ajout non effectué");
		}
	}
	
	@PutMapping("/update")
	public StringResponse update(@RequestBody Utilisateur utilisateur) {
		try {
			return utilisateurservice.update(utilisateur);
		} catch (Exception e) {
			e.printStackTrace();
			return new StringResponse(false, "Modification  effectué");
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public StringResponse delete(@PathVariable("id") Long id) {
		try {
			return utilisateurservice.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return new StringResponse(false, "Suppression non effectué");
		}
	}
	
	
	
	
	
	
	
	

}
