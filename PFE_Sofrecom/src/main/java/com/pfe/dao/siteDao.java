package com.pfe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfe.entities.RuleEvent;
import com.pfe.entities.Site;

public interface siteDao extends JpaRepository <Site ,Long >{

}
