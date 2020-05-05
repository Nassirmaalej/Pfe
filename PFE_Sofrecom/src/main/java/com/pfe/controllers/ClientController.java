package com.pfe.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.entities.Client;
import com.pfe.entities.Rule;
import com.pfe.serviceimpl.ClientServiceImpl;
import com.pfe.serviceimpl.RuleServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/client")
@ResponseBody
public class ClientController {
	@Autowired
	private ClientServiceImpl clientservice;
	
	
	
	
	@GetMapping("/liste")
	public List<Client> findAll() {
		try {
			return clientservice.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	@GetMapping(path = {"/{id}"})
	public Optional<Client> findbyOne(@PathVariable("id") Long id) throws Exception {
		
			return clientservice.findByOne(id);

}
}
