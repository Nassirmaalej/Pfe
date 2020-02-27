package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the target database table.
 * 
 */
@Entity
@NamedQuery(name="Target.findAll", query="SELECT t FROM Target t")
public class Target implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String type;

	//bi-directional one-to-one association to Fact
	@OneToOne(mappedBy="target1")
	private Fact fact1;

	//bi-directional one-to-one association to Fact
	@OneToOne(mappedBy="target2")
	private Fact fact2;

	//bi-directional one-to-one association to Path
	@OneToOne(mappedBy="target1")
	private Path path1;

	//bi-directional one-to-one association to Path
	@OneToOne(mappedBy="target2")
	private Path path2;

	//bi-directional one-to-one association to Routing
	@OneToOne(mappedBy="target")
	private Routing routing;

	//bi-directional many-to-one association to Rule
	@OneToMany(mappedBy="target1")
	private List<Rule> rules1;

	//bi-directional many-to-one association to Rule
	@OneToMany(mappedBy="target2")
	private List<Rule> rules2;

	public Target() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Fact getFact1() {
		return this.fact1;
	}

	public void setFact1(Fact fact1) {
		this.fact1 = fact1;
	}

	public Fact getFact2() {
		return this.fact2;
	}

	public void setFact2(Fact fact2) {
		this.fact2 = fact2;
	}

	public Path getPath1() {
		return this.path1;
	}

	public void setPath1(Path path1) {
		this.path1 = path1;
	}

	public Path getPath2() {
		return this.path2;
	}

	public void setPath2(Path path2) {
		this.path2 = path2;
	}

	public Routing getRouting() {
		return this.routing;
	}

	public void setRouting(Routing routing) {
		this.routing = routing;
	}

	public List<Rule> getRules1() {
		return this.rules1;
	}

	public void setRules1(List<Rule> rules1) {
		this.rules1 = rules1;
	}

	public Rule addRules1(Rule rules1) {
		getRules1().add(rules1);
		rules1.setTarget1(this);

		return rules1;
	}

	public Rule removeRules1(Rule rules1) {
		getRules1().remove(rules1);
		rules1.setTarget1(null);

		return rules1;
	}

	public List<Rule> getRules2() {
		return this.rules2;
	}

	public void setRules2(List<Rule> rules2) {
		this.rules2 = rules2;
	}

	public Rule addRules2(Rule rules2) {
		getRules2().add(rules2);
		rules2.setTarget2(this);

		return rules2;
	}

	public Rule removeRules2(Rule rules2) {
		getRules2().remove(rules2);
		rules2.setTarget2(null);

		return rules2;
	}

}