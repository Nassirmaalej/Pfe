package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ref_type database table.
 * 
 */
@Entity
@Table(name="ref_type")
@NamedQuery(name="RefType.findAll", query="SELECT r FROM RefType r")
public class RefType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="`LABEL`")
	private String label;

	//bi-directional many-to-one association to Property
	@OneToMany(mappedBy="refType1")
	private List<Property> properties1;

	//bi-directional many-to-one association to Property
	@OneToMany(mappedBy="refType2")
	private List<Property> properties2;

	public RefType() {
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

	public List<Property> getProperties1() {
		return this.properties1;
	}

	public void setProperties1(List<Property> properties1) {
		this.properties1 = properties1;
	}

	public Property addProperties1(Property properties1) {
		getProperties1().add(properties1);
		properties1.setRefType1(this);

		return properties1;
	}

	public Property removeProperties1(Property properties1) {
		getProperties1().remove(properties1);
		properties1.setRefType1(null);

		return properties1;
	}

	public List<Property> getProperties2() {
		return this.properties2;
	}

	public void setProperties2(List<Property> properties2) {
		this.properties2 = properties2;
	}

	public Property addProperties2(Property properties2) {
		getProperties2().add(properties2);
		properties2.setRefType2(this);

		return properties2;
	}

	public Property removeProperties2(Property properties2) {
		getProperties2().remove(properties2);
		properties2.setRefType2(null);

		return properties2;
	}

}