package com.pfe.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.dao.regleDao;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Motif;
import com.pfe.entities.Parcour;
import com.pfe.entities.Site;
import com.pfe.service.RuleService;
import com.pfe.service.SiteService;
@Service
public class SiteServiceImpl implements SiteService {

	
	@Autowired
	private com.pfe.dao.siteDao siteDao;
	
	
	public List<String> listeregion() throws Exception {
			int i; List<Site> x = siteDao.findAll();
			 List<String> l = new ArrayList<String>(55);

		
		for (i = 1; i < x.size(); i++) {
l.add( x.get(i).getLibelle());
		}  		
	return l ;
	}

	
	

	
	
	
	
	
	
	
	
	

	@Override
	public StringResponse save(Site site) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public StringResponse update(Site sitee) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public StringResponse delete(Site site) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Site> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	

}
