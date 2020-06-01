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

	
	

	
	public int region3() throws Exception {
		int i; List<Site> x = siteDao.findAll();
		 List<String> l = new ArrayList<String>(55);
int n = 0;
	
	for (i = 1; i < x.size(); i++) {
if (( x.get(i).getLibelle().equals("Ile de france") | x.get(i).getLibelle().equals("Centre")))

{n++;}
	}  		
	

return n ;
}

	
	
	

	public int region2() throws Exception {
		int i; List<Site> x = siteDao.findAll();
		 List<String> l = new ArrayList<String>(55);
int n = 0;
	
	for (i = 1; i < x.size(); i++) {
if (( x.get(i).getLibelle().equals("Bretagne") | x.get(i).getLibelle().equals("Pays de la loire")))

{n++;}
	}  		
	

return n ;
}

	
	
	
	
	
	
	public int region1() throws Exception {
		int i; List<Site> x = siteDao.findAll();
		 List<String> l = new ArrayList<String>(55);

	
	int nbr = 0;
	for (i = 1; i < x.size(); i++) {
if (( x.get(i).getLibelle().equals("Lorraine") || x.get(i).getLibelle().equals("Borgogne")))

             {nbr=nbr+1;}
	}  		
	

return nbr ;











}

	public int region4() throws Exception {
		int i;
		List<Site> x = siteDao.findAll();
		 List<String> l = new ArrayList<String>(55);
int n = 0;
	
	for (i = 1; i < x.size(); i++) {
if (( x.get(i).getLibelle().equals("Limousin") || x.get(i).getLibelle().equals("Auvergne")))

{n++;}
	}  		
	

return n ;
}

	public int region5() throws Exception {
		int i; List<Site> x = siteDao.findAll();
		 List<String> l = new ArrayList<String>(55);
int n = 0;
	
	for (i = 1; i < x.size(); i++) {
if (( x.get(i).getLibelle().equals("Provance") || x.get(i).getLibelle().equals("Aquitaine")))

{n=n+1;}
	}  		
	System.out.println(n);

return n ;
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
