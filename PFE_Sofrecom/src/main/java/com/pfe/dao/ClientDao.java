package com.pfe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfe.entities.Rule;
import com.pfe.entities.Client;

public interface ClientDao  extends JpaRepository <Client,Long>{

}
