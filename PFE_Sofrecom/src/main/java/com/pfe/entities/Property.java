package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the properties database table.
 * 
 */
@Entity
@Table(name="properties")
@NamedQuery(name="Property.findAll", query="SELECT p FROM Property p")
public class Property implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="`LABEL`")
	private String label;

	//bi-directional many-to-one association to Criteria
	@OneToMany(mappedBy="property1")
	private List<Criteria> criterias1;

	//bi-directional many-to-one association to Criteria
	@OneToMany(mappedBy="property2")
	private List<Criteria> criterias2;

	//bi-directional many-to-one association to Predicate
	@OneToMany(mappedBy="property1")
	private List<Predicate> predicates1;

	//bi-directional many-to-one association to Predicate
	@OneToMany(mappedBy="property2")
	private List<Predicate> predicates2;

	//bi-directional many-to-one association to RefType
	@ManyToOne
	@JoinColumn(name="TYPE",insertable=false, updatable=false)
	private RefType refType1;

	//bi-directional many-to-one association to RefType
	@ManyToOne
	@JoinColumn(name="TYPE",insertable=false, updatable=false)
	private RefType refType2;

	public Property() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Criteria> getCriterias1() {
		return this.criterias1;
	}

	public void setCriterias1(List<Criteria> criterias1) {
		this.criterias1 = criterias1;
	}

	public Criteria addCriterias1(Criteria criterias1) {
		getCriterias1().add(criterias1);
		criterias1.setProperty1(this);

		return criterias1;
	}

	public Criteria removeCriterias1(Criteria criterias1) {
		getCriterias1().remove(criterias1);
		criterias1.setProperty1(null);

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
		criterias2.setProperty2(this);

		return criterias2;
	}

	public Criteria removeCriterias2(Criteria criterias2) {
		getCriterias2().remove(criterias2);
		criterias2.setProperty2(null);

		return criterias2;
	}

	public List<Predicate> getPredicates1() {
		return this.predicates1;
	}

	public void setPredicates1(List<Predicate> predicates1) {
		this.predicates1 = predicates1;
	}

	public Predicate addPredicates1(Predicate predicates1) {
		getPredicates1().add(predicates1);
		predicates1.setProperty1(this);

		return predicates1;
	}

	public Predicate removePredicates1(Predicate predicates1) {
		getPredicates1().remove(predicates1);
		predicates1.setProperty1(null);

		return predicates1;
	}

	public List<Predicate> getPredicates2() {
		return this.predicates2;
	}

	public void setPredicates2(List<Predicate> predicates2) {
		this.predicates2 = predicates2;
	}

	public Predicate addPredicates2(Predicate predicates2) {
		getPredicates2().add(predicates2);
		predicates2.setProperty2(this);

		return predicates2;
	}

	public Predicate removePredicates2(Predicate predicates2) {
		getPredicates2().remove(predicates2);
		predicates2.setProperty2(null);

		return predicates2;
	}

	public RefType getRefType1() {
		return this.refType1;
	}

	public void setRefType1(RefType refType1) {
		this.refType1 = refType1;
	}

	public RefType getRefType2() {
		return this.refType2;
	}

	public void setRefType2(RefType refType2) {
		this.refType2 = refType2;
	}

}