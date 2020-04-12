package com.pfe.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.dao.ParcoursDao;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Motif;
import com.pfe.entities.Parcour;
import com.pfe.service.MotifService;
import com.pfe.service.ParcoursService;

@Service
public class ParcoursServiceImpl implements ParcoursService {
	
	@Autowired
	private ParcoursDao parcourDao;

	
	@Transactional
	public List<Parcour> findAll() throws Exception {
		return parcourDao.findAll();

	}


	@Override
	public StringResponse save(Parcour motif) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public StringResponse update(Parcour motif) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public StringResponse delete(Parcour id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	



}
