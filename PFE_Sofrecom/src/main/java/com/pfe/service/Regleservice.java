package com.pfe.service;

import java.awt.Event;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.github.shyiko.mysql.binlog.BinaryLogClient.LifecycleListener;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Rule;

public interface Regleservice {

	public StringResponse save(Rule regle) throws Exception;

	public StringResponse update(Rule regle) throws Exception;

	public StringResponse delete(Long id) throws Exception;

	public List<Rule> findAll() throws Exception;
	// TODO Auto-generated method stub

	// TODO Auto-generated method stub

	public Rule findByOne(Long id) throws Exception;

	public String redlog() throws Exception;
	// TODO Auto-generated method stub

}