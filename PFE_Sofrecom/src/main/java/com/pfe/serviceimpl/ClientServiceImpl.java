package com.pfe.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.dao.ClientDao;
import com.pfe.dao.regleDao;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Client;
import com.pfe.entities.Rule;
import com.pfe.service.ClientService;
import com.pfe.service.RuleService;

@Service
public class ClientServiceImpl implements ClientService {

	
	@Autowired
	private ClientDao clientDao;
	
	
	
	
	
	@Override
	public StringResponse save(Client client) throws Exception {
		// TODO Auto-generated method stub
		clientDao.save(client);
		return new StringResponse(true, "Ajout effecué");	}

	@Override
	public StringResponse update(Client client) throws Exception {
		clientDao.save(client);
		return new StringResponse(true, "modification effecué");		// TODO Auto-generated method stub
	}

	@Override
	public StringResponse delete(Client client) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAll() throws Exception {
		// TODO Auto-generated method stub
		return clientDao.findAll();
	}

	@Override
	public Optional<Client> findByOne(Long id) throws Exception {
		// TODO Auto-generated method stub
		 return clientDao.findById(id);
	}



	
	
}
