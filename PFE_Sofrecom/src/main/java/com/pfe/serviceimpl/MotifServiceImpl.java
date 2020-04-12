package com.pfe.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.dao.regleDao;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Motif;
import com.pfe.entities.Rule;
import com.pfe.service.MotifService;


@Service
public class MotifServiceImpl implements MotifService  {

	@Autowired
	private com.pfe.dao.motifDao motifDao;
	
	
	@Transactional
	public List<Motif> findAll() throws Exception {
		return motifDao.findAll();

	}


	@Override
	public StringResponse save(Motif motif) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public StringResponse update(Motif motif) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public StringResponse delete(Motif id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public int Assistancecommerciale() throws Exception {
		int nbr = 0;	int i; List<Motif> x = motifDao.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("Assistance commerciale"))){nbr = nbr + 1;}}  		
		return nbr;
	}
	public int Assurancemobile() throws Exception {
		int nbr = 0;	int i; List<Motif> x = motifDao.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("Assurance mobile"))){nbr = nbr + 1;}}  		
		return nbr;
	}
	public int Desimlockage() throws Exception {
		int nbr = 0;	int i; List<Motif> x = motifDao.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("Desimlockage"))){nbr = nbr + 1;}}  		
		return nbr;
	}
	public int Activationweb() throws Exception {
		int nbr = 0;	int i; List<Motif> x = motifDao.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("Activation web"))){nbr = nbr + 1;}}  		
		return nbr;
	}
	public int Paiementfacture() throws Exception {
		int nbr = 0;	int i; List<Motif> x = motifDao.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("Paiement facture"))){nbr = nbr + 1;}}  		
		return nbr;
	}
	public int Informationsurlaconsommation() throws Exception {
		int nbr = 0;	int i; List<Motif> x = motifDao.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("Information sur la consommation"))){nbr = nbr + 1;}}  		
		return nbr;
	}
	
	
	public int Choixintermédairenonvalide () throws Exception {
		int nbr = 0;	int i; List<Motif> x = motifDao.findAll();
		for (i = 0; i < x.size(); i++) {
			if ((x.get(i).getLibelle().equals("Choix intermédaire non valide "))){nbr = nbr + 1;}}  		
		return nbr;
	}
	
	
}
