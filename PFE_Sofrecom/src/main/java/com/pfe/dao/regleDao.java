package com.pfe.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.entities.Rule;

@Repository
public interface regleDao extends JpaRepository <Rule ,Long > {

}