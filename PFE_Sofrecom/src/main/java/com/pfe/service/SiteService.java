package com.pfe.service;

import java.util.List;

import com.pfe.dto.StringResponse;
import com.pfe.entities.Rule;
import com.pfe.entities.Site;

public interface SiteService {

	public StringResponse save(Site site) throws Exception;

	public StringResponse update(Site sitee) throws Exception;

	public StringResponse delete(Site site) throws Exception;

	public List<Site> findAll() throws Exception;
}
