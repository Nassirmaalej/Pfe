package com.pfe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.dao.ParcoursDao;
import com.pfe.entities.Parcour;
import com.pfe.entities.Rule;
import com.pfe.serviceimpl.MotifServiceImpl;
import com.pfe.serviceimpl.ParcoursServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/parcour")
@ResponseBody
public class ParcoursController {
	

	@Autowired
	private ParcoursServiceImpl parcourservice;
	

	
	@GetMapping("/blackliste")

	public int blackliste() throws Exception {
		int nbr = 0;
		int i;
		List<Parcour> x = parcourservice.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("Parcours client blacklisté")))
			{	nbr = nbr + 1;}
		}	return nbr;}
	
	
	
	
	
	@GetMapping("/clientVIP")

	public int clientVIP() throws Exception {
		int nbr = 0;
		int i;
		List<Parcour> x = parcourservice.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("Parcours standard client VIP")))
			{	nbr = nbr + 1;}
		}	return nbr;}
	
	
	
	@GetMapping("/clientenrecouvrement")

	public int clientenrecouvrement() throws Exception {
		int nbr = 0;
		int i;
		List<Parcour> x = parcourservice.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("parcours client en recouvrement")))
			{	nbr = nbr + 1;}
		}	return nbr;}
	

	@GetMapping("/Parcoursstandardlangagenaturel")

	public int  Parcoursstandardlangagenaturel() throws Exception {
		int nbr = 0;
		int i;
		List<Parcour> x = parcourservice.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("Parcours standard langage naturel")))
			{	nbr = nbr + 1;}
		}	return nbr;}
	
	
	
	
	
	
	
	
	
}
