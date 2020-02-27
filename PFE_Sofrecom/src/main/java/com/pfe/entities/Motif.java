package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the motif database table.
 * 
 */
@Entity
@NamedQuery(name="Motif.findAll", query="SELECT m FROM Motif m")
public class Motif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String code;

	private String libelle;

	public Motif() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}