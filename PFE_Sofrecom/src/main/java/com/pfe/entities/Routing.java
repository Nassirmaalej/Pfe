package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the routing database table.
 * 
 */
@Entity
@NamedQuery(name="Routing.findAll", query="SELECT r FROM Routing r")
public class Routing implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to ServiceMandora
	@ManyToOne
	@JoinColumn(name="SERVICE_ID",insertable=false, updatable=false)
	private ServiceMandora serviceMandora1;

	//bi-directional one-to-one association to Target
	@OneToOne
	@JoinColumn(name="ID")
	private Target target;

	//bi-directional many-to-one association to ServiceMandora
	@ManyToOne
	@JoinColumn(name="SERVICE_ID")
	private ServiceMandora serviceMandora2;

	public Routing() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ServiceMandora getServiceMandora1() {
		return this.serviceMandora1;
	}

	public void setServiceMandora1(ServiceMandora serviceMandora1) {
		this.serviceMandora1 = serviceMandora1;
	}

	public Target getTarget() {
		return this.target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public ServiceMandora getServiceMandora2() {
		return this.serviceMandora2;
	}

	public void setServiceMandora2(ServiceMandora serviceMandora2) {
		this.serviceMandora2 = serviceMandora2;
	}

}