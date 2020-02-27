package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the fact database table.
 * 
 */
@Entity
@NamedQuery(name="Fact.findAll", query="SELECT f FROM Fact f")
public class Fact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to Criteria
	@OneToMany(mappedBy="fact1")
	private List<Criteria> criterias1;

	//bi-directional many-to-one association to Criteria
	@OneToMany(mappedBy="fact2")
	private List<Criteria> criterias2;

	//bi-directional one-to-one association to Target
	@OneToOne
	@JoinColumn(name="ID")
	private Target target1;

	//bi-directional one-to-one association to Target
	@OneToOne
	@JoinColumn(name="ID")
	private Target target2;

	public Fact() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Criteria> getCriterias1() {
		return this.criterias1;
	}

	public void setCriterias1(List<Criteria> criterias1) {
		this.criterias1 = criterias1;
	}

	public Criteria addCriterias1(Criteria criterias1) {
		getCriterias1().add(criterias1);
		criterias1.setFact1(this);

		return criterias1;
	}

	public Criteria removeCriterias1(Criteria criterias1) {
		getCriterias1().remove(criterias1);
		criterias1.setFact1(null);

		return criterias1;
	}

	public List<Criteria> getCriterias2() {
		return this.criterias2;
	}

	public void setCriterias2(List<Criteria> criterias2) {
		this.criterias2 = criterias2;
	}

	public Criteria addCriterias2(Criteria criterias2) {
		getCriterias2().add(criterias2);
		criterias2.setFact2(this);

		return criterias2;
	}

	public Criteria removeCriterias2(Criteria criterias2) {
		getCriterias2().remove(criterias2);
		criterias2.setFact2(null);

		return criterias2;
	}

	public Target getTarget1() {
		return this.target1;
	}

	public void setTarget1(Target target1) {
		this.target1 = target1;
	}

	public Target getTarget2() {
		return this.target2;
	}

	public void setTarget2(Target target2) {
		this.target2 = target2;
	}

}