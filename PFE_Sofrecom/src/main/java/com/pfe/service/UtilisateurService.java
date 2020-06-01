package com.pfe.service;

import java.util.List;

import com.pfe.dto.StringResponse;
import com.pfe.entities.Site;
import com.pfe.entities.Utilisateur;

public interface UtilisateurService {

	
	public StringResponse save(Utilisateur utilisateur) throws Exception;

	public StringResponse update(Utilisateur utilisateur) throws Exception;

	public StringResponse delete(Utilisateur utilisateur) throws Exception;

	public List<Site> findAll() throws Exception;
	
}
