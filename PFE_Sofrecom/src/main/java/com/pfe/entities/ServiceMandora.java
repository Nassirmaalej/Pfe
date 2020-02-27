package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the service_mandora database table.
 * 
 */
@Entity
@Table(name="service_mandora")
@NamedQuery(name="ServiceMandora.findAll", query="SELECT s FROM ServiceMandora s")
public class ServiceMandora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String acronyme;

	private String nom;

	private String origine;

	//bi-directional many-to-one association to Routing
	@OneToMany(mappedBy="serviceMandora1")
	private List<Routing> routings1;

	//bi-directional many-to-one association to Routing
	@OneToMany(mappedBy="serviceMandora2")
	private List<Routing> routings2;

	public ServiceMandora() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcronyme() {
		return this.acronyme;
	}

	public void setAcronyme(String acronyme) {
		this.acronyme = acronyme;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getOrigine() {
		return this.origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public List<Routing> getRoutings1() {
		return this.routings1;
	}

	public void setRoutings1(List<Routing> routings1) {
		this.routings1 = routings1;
	}

	public Routing addRoutings1(Routing routings1) {
		getRoutings1().add(routings1);
		routings1.setServiceMandora1(this);

		return routings1;
	}

	public Routing removeRoutings1(Routing routings1) {
		getRoutings1().remove(routings1);
		routings1.setServiceMandora1(null);

		return routings1;
	}

	public List<Routing> getRoutings2() {
		return this.routings2;
	}

	public void setRoutings2(List<Routing> routings2) {
		this.routings2 = routings2;
	}

	public Routing addRoutings2(Routing routings2) {
		getRoutings2().add(routings2);
		routings2.setServiceMandora2(this);

		return routings2;
	}

	public Routing removeRoutings2(Routing routings2) {
		getRoutings2().remove(routings2);
		routings2.setServiceMandora2(null);

		return routings2;
	}

}