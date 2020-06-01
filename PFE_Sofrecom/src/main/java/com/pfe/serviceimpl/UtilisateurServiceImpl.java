package com.pfe.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.dao.UtilisateurDao;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Utilisateur;
@Service
public class UtilisateurServiceImpl {

	@Autowired
	private UtilisateurDao utilisateurDao;
	
	
	
	
	
	public StringResponse save(Utilisateur utilisateur) throws Exception {
		// TODO Auto-generated method stub
		utilisateurDao.save(utilisateur);
		return new StringResponse(true, "Ajout effecué");	}

	public StringResponse update(Utilisateur utilisateur) throws Exception {
		utilisateurDao.save(utilisateur);
		return new StringResponse(true, "modification effecué");		// TODO Auto-generated method stub
	}

	@Transactional
	public StringResponse delete(Long id) throws Exception {
		utilisateurDao.deleteById(id);
		return new StringResponse(true, "Suppression effecué");

	}

	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return utilisateurDao.findAll();	}

}
