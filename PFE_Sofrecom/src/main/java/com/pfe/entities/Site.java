package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the site database table.
 * 
 */
@Entity
@NamedQuery(name="Site.findAll", query="SELECT s FROM Site s")
public class Site implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	private String libelle;

	private String utilisateur;

	public Site() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

}