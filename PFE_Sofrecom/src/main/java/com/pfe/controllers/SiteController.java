package com.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.entities.Parcour;
import com.pfe.serviceimpl.RuleServiceImpl;
import com.pfe.serviceimpl.SiteServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/site")
@ResponseBody
public class SiteController {
	@Autowired
	private SiteServiceImpl siteservice;
	
	
	
	
	
	
	@GetMapping("/listeregion")
public List<String> listeregion() throws Exception {
			return siteservice.listeregion();
	}
	
	
	
	
	
	
	
	
	
	
//
}
