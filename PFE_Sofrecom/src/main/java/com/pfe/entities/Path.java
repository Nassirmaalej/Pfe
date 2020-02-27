package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the path database table.
 * 
 */
@Entity
@NamedQuery(name="Path.findAll", query="SELECT p FROM Path p")
public class Path implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional one-to-one association to Target
	@OneToOne
	@JoinColumn(name="ID")
	private Target target1;

	//bi-directional one-to-one association to Target
	@OneToOne
	@JoinColumn(name="ID")
	private Target target2;

	//bi-directional many-to-one association to Parcour
	@ManyToOne
	@JoinColumn(name="path")
	private Parcour parcour;

	public Path() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Parcour getParcour() {
		return this.parcour;
	}

	public void setParcour(Parcour parcour) {
		this.parcour = parcour;
	}

}