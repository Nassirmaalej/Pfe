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
	
	
	
	
	@GetMapping("/region1")
public int region1() throws Exception {
			return siteservice.region1();
	}
	
	
	
	@GetMapping("/region2")
public int region2() throws Exception {
			return siteservice.region2();
	}
	
	
	
	@GetMapping("/region3")
public int region3() throws Exception {
			return siteservice.region3();
	}
	
	
	
	@GetMapping("/region4")
public int region4() throws Exception {
			return siteservice.region4();
	}
	
	@GetMapping("/region5")
public int region5() throws Exception {
			return siteservice.region5();
	}
	
	
//
}
