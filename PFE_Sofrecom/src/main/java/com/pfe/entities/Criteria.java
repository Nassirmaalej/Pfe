package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the criteria database table.
 * 
 */
@Entity
@NamedQuery(name="Criteria.findAll", query="SELECT c FROM Criteria c")
public class Criteria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String value;

	//bi-directional many-to-one association to Fact
	@ManyToOne
	@JoinColumn(name="FACT",insertable=false, updatable=false)
	private Fact fact1;

	//bi-directional many-to-one association to Property
	@ManyToOne
	@JoinColumn(name="PROPERTY",insertable=false, updatable=false)
	private Property property1;

	//bi-directional many-to-one association to Fact
	@ManyToOne
	@JoinColumn(name="FACT",insertable=false, updatable=false)
	private Fact fact2;

	//bi-directional many-to-one association to Property
	@ManyToOne
	@JoinColumn(name="PROPERTY")
	private Property property2;

	public Criteria() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Fact getFact1() {
		return this.fact1;
	}

	public void setFact1(Fact fact1) {
		this.fact1 = fact1;
	}

	public Property getProperty1() {
		return this.property1;
	}

	public void setProperty1(Property property1) {
		this.property1 = property1;
	}

	public Fact getFact2() {
		return this.fact2;
	}

	public void setFact2(Fact fact2) {
		this.fact2 = fact2;
	}

	public Property getProperty2() {
		return this.property2;
	}

	public void setProperty2(Property property2) {
		this.property2 = property2;
	}

}