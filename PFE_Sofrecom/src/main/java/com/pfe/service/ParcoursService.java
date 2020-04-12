package com.pfe.service;

import java.util.List;

import com.pfe.dto.StringResponse;
import com.pfe.entities.Motif;
import com.pfe.entities.Parcour;

public interface ParcoursService {
	public StringResponse save(Parcour motif) throws Exception;

	public StringResponse update(Parcour motif) throws Exception;

	public StringResponse delete(Parcour id) throws Exception;

	public List<Parcour> findAll() throws Exception;
}
