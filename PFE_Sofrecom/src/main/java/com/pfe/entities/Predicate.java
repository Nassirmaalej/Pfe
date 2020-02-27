package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the predicate database table.
 * 
 */
@Entity
@NamedQuery(name="Predicate.findAll", query="SELECT p FROM Predicate p")
public class Predicate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String value;

	//bi-directional many-to-one association to Expression
	@OneToMany(mappedBy="predicate1")
	private List<Expression> expressions1;

	//bi-directional many-to-one association to Expression
	@OneToMany(mappedBy="predicate2")
	private List<Expression> expressions2;

	//bi-directional many-to-one association to Property
	@ManyToOne
	@JoinColumn(name="FIELD")
	private Property property1;

	//bi-directional many-to-one association to Operator
	@ManyToOne
	@JoinColumn(name="OPERATOR",insertable=false, updatable=false)
	private Operator operator1;

	//bi-directional many-to-one association to Property
	@ManyToOne
	@JoinColumn(name="FIELD",insertable=false, updatable=false)
	private Property property2;

	//bi-directional many-to-one association to Operator
	@ManyToOne
	@JoinColumn(name="OPERATOR")
	private Operator operator2;

	public Predicate() {
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

	public List<Expression> getExpressions1() {
		return this.expressions1;
	}

	public void setExpressions1(List<Expression> expressions1) {
		this.expressions1 = expressions1;
	}

	public Expression addExpressions1(Expression expressions1) {
		getExpressions1().add(expressions1);
		expressions1.setPredicate1(this);

		return expressions1;
	}

	public Expression removeExpressions1(Expression expressions1) {
		getExpressions1().remove(expressions1);
		expressions1.setPredicate1(null);

		return expressions1;
	}

	public List<Expression> getExpressions2() {
		return this.expressions2;
	}

	public void setExpressions2(List<Expression> expressions2) {
		this.expressions2 = expressions2;
	}

	public Expression addExpressions2(Expression expressions2) {
		getExpressions2().add(expressions2);
		expressions2.setPredicate2(this);

		return expressions2;
	}

	public Expression removeExpressions2(Expression expressions2) {
		getExpressions2().remove(expressions2);
		expressions2.setPredicate2(null);

		return expressions2;
	}

	public Property getProperty1() {
		return this.property1;
	}

	public void setProperty1(Property property1) {
		this.property1 = property1;
	}

	public Operator getOperator1() {
		return this.operator1;
	}

	public void setOperator1(Operator operator1) {
		this.operator1 = operator1;
	}

	public Property getProperty2() {
		return this.property2;
	}

	public void setProperty2(Property property2) {
		this.property2 = property2;
	}

	public Operator getOperator2() {
		return this.operator2;
	}

	public void setOperator2(Operator operator2) {
		this.operator2 = operator2;
	}

}