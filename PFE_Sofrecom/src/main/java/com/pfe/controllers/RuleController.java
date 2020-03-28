package com.pfe.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

import org.apache.tomcat.util.threads.TaskThread;
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

	@RequestMapping("/a")
	String home() {
		return " Hello World! ";
	}

	//
	//

	@GetMapping("/red")
	public void redlog() throws Exception {

		regleservice.redlog();

	}

	/* return new ResponseEntity<T>("Hello",HttpStatus.CREATED); */

	@GetMapping("/listrule")
	public List<RuleEvent> findAll1() throws Exception {

		return regleservice.findAll1();

	}

	@GetMapping("/statx")
	public int statx() throws Exception {
		int nbrx = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println("xa" + x.get(i).getType());
			if ((x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbrx = nbrx + 1;
			}

		}

		return nbrx;

	}

	@GetMapping("/staty")
	public int staty() throws Exception {
		int nbry = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println("a" + x.get(i).getType());
			if ((x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbry = nbry + 1;
			}

		}

		return nbry;

	}

	@GetMapping("/statz")
	public int statz() throws Exception {
		int nbrz = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println("az" + x.get(i).getType());
			if ((x.get(i).getType()).equals("Evenement de modification"))

			{
				nbrz = nbrz + 1;
			}

		}

		return nbrz;

	}

	// les stat par moins
	/////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/statjan")
	public int statjan() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("01"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statfev")
	public int statfev() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("02"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statmar")
	public int statmar() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();

		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("03"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}
	
	

	
	
	
	
	
	
	
	
	

	@GetMapping("/statavr")
	public int statavr() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("04"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statmai")
	public int statmai() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("05"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statjui")
	public int statjui() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("06"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statjul")
	public int statjul() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("07"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statout")
	public int statout() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("08"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statsep")
	public int statsep() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("09"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statoct")
	public int statoct() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("10"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statnov")
	public int statnov() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("11"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdec")
	public int statdec() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			System.out.println(x.get(i).getDate().subSequence(3, 5));
			if ((x.get(i).getDate()).subSequence(3, 5).equals("12"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	//////////////////////////////////////////// whrite/////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping("/statwhritejan")
	public int statwhritejan() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("01")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhritefev")
	public int statwhritefev() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("02")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhritemar")
	public int statwhritemar() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();

		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("03")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhriteavr")
	public int statwhriteavr() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("04")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhritemai")
	public int statwhritemai() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("05")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhritejui")
	public int statwhritejui() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("06")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhritejul")
	public int statwhritejul() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("07")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhriteout")
	public int statwhriteout() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("08")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhritesep")
	public int statwhritesep() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("09")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhriteoct")
	public int statwhriteoct() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("10")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhritenov")
	public int statwhritenov() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("11")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statwhritedec")
	public int statwhritedec() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("12")
					&& (x.get(i).getType()).equals("Evenement d'insertion"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////delete///////////////////////////////////////////////////////////
	
	

	@GetMapping("/statdeletejan")
	public int statdeletejan() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("01")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeletefev")
	public int statdeletefev() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("02")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeletemar")
	public int statdeletemar() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();

		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("03")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeleteavr")
	public int statdeleteavr() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("04")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeletemai")
	public int statdeletemai() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("05")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeletejui")
	public int statdeletejui() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("06")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeletejul")
	public int statdeletejul() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("07")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeleteout")
	public int statdeleteout() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("08")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeletesep")
	public int statdeletesep() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("09")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeleteoct")
	public int statdeleteoct() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("10")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeletenov")
	public int statdeletenov() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("11")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

	}

	@GetMapping("/statdeletedec")
	public int statdeletedec() throws Exception {
		int nbr = 0;
		int i;
		List<RuleEvent> x = regleservice.findAll1();
		System.out.println(x.get(0).getType());
		for (i = 0; i < x.size(); i++) {

			if ((x.get(i).getDate()).subSequence(3, 5).equals("12")
					&& (x.get(i).getType()).equals("Evenement de suppression"))

			{
				nbr = nbr + 1;
			}

		}

		return nbr;

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