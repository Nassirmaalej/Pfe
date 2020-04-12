package com.pfe.service;

import java.util.List;

import com.pfe.dto.StringResponse;
import com.pfe.entities.Motif;
import com.pfe.entities.Rule;

public interface MotifService {
	

	public StringResponse save(Motif motif) throws Exception;

	public StringResponse update(Motif motif) throws Exception;

	public StringResponse delete(Motif id) throws Exception;

	public List<Motif> findAll() throws Exception;
	
	

}
