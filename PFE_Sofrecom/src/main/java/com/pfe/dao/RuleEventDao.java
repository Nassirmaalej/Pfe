package com.pfe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.pfe.entities.RuleEvent;

@Repository
public interface RuleEventDao extends JpaRepository <RuleEvent ,Long > {

	

}
//
//