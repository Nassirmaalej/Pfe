package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the operator database table.
 * 
 */
@Entity
@NamedQuery(name="Operator.findAll", query="SELECT o FROM Operator o")
public class Operator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String code;

	@Column(name="`LABEL`")
	private String label;

	//bi-directional many-to-one association to Expression
	@OneToMany(mappedBy="operator1")
	private List<Expression> expressions1;

	//bi-directional many-to-one association to Expression
	@OneToMany(mappedBy="operator2")
	private List<Expression> expressions2;

	//bi-directional many-to-one association to Expression
	@OneToMany(mappedBy="operator3")
	private List<Expression> expressions3;

	//bi-directional many-to-one association to Expression
	@OneToMany(mappedBy="operator4")
	private List<Expression> expressions4;

	//bi-directional many-to-one association to Predicate
	@OneToMany(mappedBy="operator1")
	private List<Predicate> predicates1;

	//bi-directional many-to-one association to Predicate
	@OneToMany(mappedBy="operator2")
	private List<Predicate> predicates2;

	public Operator() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<Expression> getExpressions1() {
		return this.expressions1;
	}

	public void setExpressions1(List<Expression> expressions1) {
		this.expressions1 = expressions1;
	}

	public Expression addExpressions1(Expression expressions1) {
		getExpressions1().add(expressions1);
		expressions1.setOperator1(this);

		return expressions1;
	}

	public Expression removeExpressions1(Expression expressions1) {
		getExpressions1().remove(expressions1);
		expressions1.setOperator1(null);

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
		expressions2.setOperator2(this);

		return expressions2;
	}

	public Expression removeExpressions2(Expression expressions2) {
		getExpressions2().remove(expressions2);
		expressions2.setOperator2(null);

		return expressions2;
	}

	public List<Expression> getExpressions3() {
		return this.expressions3;
	}

	public void setExpressions3(List<Expression> expressions3) {
		this.expressions3 = expressions3;
	}

	public Expression addExpressions3(Expression expressions3) {
		getExpressions3().add(expressions3);
		expressions3.setOperator3(this);

		return expressions3;
	}

	public Expression removeExpressions3(Expression expressions3) {
		getExpressions3().remove(expressions3);
		expressions3.setOperator3(null);

		return expressions3;
	}

	public List<Expression> getExpressions4() {
		return this.expressions4;
	}

	public void setExpressions4(List<Expression> expressions4) {
		this.expressions4 = expressions4;
	}

	public Expression addExpressions4(Expression expressions4) {
		getExpressions4().add(expressions4);
		expressions4.setOperator4(this);

		return expressions4;
	}

	public Expression removeExpressions4(Expression expressions4) {
		getExpressions4().remove(expressions4);
		expressions4.setOperator4(null);

		return expressions4;
	}

	public List<Predicate> getPredicates1() {
		return this.predicates1;
	}

	public void setPredicates1(List<Predicate> predicates1) {
		this.predicates1 = predicates1;
	}

	public Predicate addPredicates1(Predicate predicates1) {
		getPredicates1().add(predicates1);
		predicates1.setOperator1(this);

		return predicates1;
	}

	public Predicate removePredicates1(Predicate predicates1) {
		getPredicates1().remove(predicates1);
		predicates1.setOperator1(null);

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
		predicates2.setOperator2(this);

		return predicates2;
	}

	public Predicate removePredicates2(Predicate predicates2) {
		getPredicates2().remove(predicates2);
		predicates2.setOperator2(null);

		return predicates2;
	}

}