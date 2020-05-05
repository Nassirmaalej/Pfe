package com.pfe.service;

import java.util.List;
import java.util.Optional;

import com.pfe.dto.StringResponse;
import com.pfe.entities.Client;
import com.pfe.entities.Rule;

public interface ClientService {

	
	public StringResponse save(Client client) throws Exception;

	public StringResponse update(Client client) throws Exception;

	public StringResponse delete(Client client) throws Exception;

	public List<Client> findAll() throws Exception;
	// TODO Auto-generated method stub

	// TODO Auto-generated method stub

	public Optional<Client> findByOne(Long id) throws Exception;
	
	
	
	
	
	
	
	
}
