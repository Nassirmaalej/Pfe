package com.pfe.controllers;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.dto.RuleEventDto;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Rule;
import com.pfe.serviceimpl.RuleServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/regle")

public class RuleController {
	@Autowired
	private RuleServiceImpl regleservice;
	
	@RequestMapping ( "/a" )
	 String  home () {
		 return  " Hello World! " ;
	}
	
	
	@GetMapping("/red")
	public List<RuleEventDto> redlog() throws IOException, TimeoutException{
		
	
	              
			  List<RuleEventDto> T = regleservice.redlog();
			  return T;
			 
					
		
		/* return new ResponseEntity<T>("Hello",HttpStatus.CREATED); */
	}

	
	@GetMapping("/list")
	public List<Rule> findAll() throws Exception {
		
			return regleservice.findAll();
		
		
	}
	

	
	@PostMapping("/add")
	public StringResponse add(@RequestBody Rule regle) {
		try {
			return regleservice.save(regle);
		} catch (Exception e) {
			e.printStackTrace();
			return new StringResponse(false, "Ajout non effectué");
		}
	}
	
	@PutMapping("/update")
	public StringResponse update(@RequestBody Rule regle) {
		try {
			return regleservice.update(regle);
		} catch (Exception e) {
			e.printStackTrace();
			return new StringResponse(false, "Modification non effectué");
		}
	}
	
	 
	@DeleteMapping("/delete/{id}")
	public StringResponse delete(@PathVariable("id") Long id) {
		try {
			return regleservice.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return new StringResponse(false, "Suppression non effectué");
		}
	}

	
	
}