package com.pfe.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

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

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.pfe.dto.RuleEventDto;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Rule;
import com.pfe.entities.RuleEvent;
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
	public void redlog() throws Exception{
		
	
				 regleservice.redlog();

				
				}
			              
					
		
		/* return new ResponseEntity<T>("Hello",HttpStatus.CREATED); */
	
	@GetMapping("/listrule")
	public List<RuleEvent> findAll1() throws Exception {
		
			return regleservice.findAll1();
		
		
	}
	
	
	@GetMapping("/statx")
	public int  statx() throws Exception {
		int nbrx=0;
		int i ;
		List<RuleEvent> x =regleservice.findAll1();
		System.out.println(x.get(0).getType()) ;
		for (i=0 ; i<x.size() ; i++)
		{
			
			System.out.println("a"+ x.get(i).getType()) ;
		if ( (x.get(i).getType() ).equals ("WriteRowsEventData") ) 
			
			
		{nbrx=nbrx+1;}
		
		}
		
	return nbrx;
	
		
	}
	
	
	
	@GetMapping("/staty")
	public int  staty() throws Exception {
		int nbry=0;
		int i ;
		List<RuleEvent> x =regleservice.findAll1();
		System.out.println(x.get(0).getType()) ;
		for (i=0 ; i<x.size() ; i++)
		{
			
			System.out.println("a"+ x.get(i).getType()) ;
		if ( (x.get(i).getType() ).equals ("DeleteRowsEventData") ) 
				
		{nbry=nbry+1;}
		
		}
		
	return nbry;
	
		
	}
	
	
	
	@GetMapping("/statz")
	public int  statz() throws Exception {
		int nbrz=0;
		int i ;
		List<RuleEvent> x =regleservice.findAll1();
		System.out.println(x.get(0).getType()) ;
		for (i=0 ; i<x.size() ; i++)
		{
			
			System.out.println("a"+ x.get(i).getType()) ;
		if ( (x.get(i).getType()) .equals ("UpdateRowsEventData") ) 
			
		{nbrz=nbrz+1;}
		
		}
		
	return nbrz;
	
		
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