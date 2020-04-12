package com.pfe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.entities.Parcour;
import com.pfe.entities.Rule;

@Repository
public interface ParcoursDao  extends JpaRepository <Parcour,String>{

}
