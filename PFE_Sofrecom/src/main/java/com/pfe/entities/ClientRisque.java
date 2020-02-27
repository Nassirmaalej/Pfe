package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the client_risque database table.
 * 
 */
@Entity
@Table(name="client_risque")
@NamedQuery(name="ClientRisque.findAll", query="SELECT c FROM ClientRisque c")
public class ClientRisque implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String nd;

	private String description;

	private String etat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	private String utilisateur;

	public ClientRisque() {
	}

	public String getNd() {
		return this.nd;
	}

	public void setNd(String nd) {
		this.nd = nd;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

}