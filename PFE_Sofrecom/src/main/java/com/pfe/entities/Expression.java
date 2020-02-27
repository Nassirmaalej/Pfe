package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the expression database table.
 * 
 */
@Entity
@NamedQuery(name="Expression.findAll", query="SELECT e FROM Expression e")
public class Expression implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int ordre;

	//bi-directional many-to-one association to Operator
	@ManyToOne
	@JoinColumn(name="PREVIOUS")
	private Operator operator1;

	//bi-directional many-to-one association to Expression
	@ManyToOne
	@JoinColumn(name="PARENT_ID")
	private Expression expression1;

	//bi-directional many-to-one association to Expression
	@OneToMany(mappedBy="expression1")
	private List<Expression> expressions1;

	//bi-directional many-to-one association to Operator
	@ManyToOne
	@JoinColumn(name="NEXT",insertable=false, updatable=false)
	private Operator operator2;

	//bi-directional many-to-one association to Operator
	@ManyToOne
	@JoinColumn(name="NEXT",insertable=false, updatable=false)
	private Operator operator3;

	//bi-directional many-to-one association to Operator
	@ManyToOne
	@JoinColumn(name="PREVIOUS",insertable=false, updatable=false)
	private Operator operator4;

	//bi-directional many-to-one association to Expression
	@ManyToOne
	@JoinColumn(name="PARENT_ID",insertable=false, updatable=false)
	private Expression expression2;

	//bi-directional many-to-one association to Expression
	@OneToMany(mappedBy="expression2")
	private List<Expression> expressions2;

	//bi-directional many-to-one association to Predicate
	@ManyToOne
	@JoinColumn(name="CONDITION_ID",insertable=false, updatable=false)
	private Predicate predicate1;

	//bi-directional many-to-one association to Predicate
	@ManyToOne
	@JoinColumn(name="CONDITION_ID",insertable=false, updatable=false)
	private Predicate predicate2;

	//bi-directional many-to-one association to Rule
	@OneToMany(mappedBy="expression1")
	private List<Rule> rules1;

	//bi-directional many-to-one association to Rule
	@OneToMany(mappedBy="expression2")
	private List<Rule> rules2;

	public Expression() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrdre() {
		return this.ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public Operator getOperator1() {
		return this.operator1;
	}

	public void setOperator1(Operator operator1) {
		this.operator1 = operator1;
	}

	public Expression getExpression1() {
		return this.expression1;
	}

	public void setExpression1(Expression expression1) {
		this.expression1 = expression1;
	}

	public List<Expression> getExpressions1() {
		return this.expressions1;
	}

	public void setExpressions1(List<Expression> expressions1) {
		this.expressions1 = expressions1;
	}

	public Expression addExpressions1(Expression expressions1) {
		getExpressions1().add(expressions1);
		expressions1.setExpression1(this);

		return expressions1;
	}

	public Expression removeExpressions1(Expression expressions1) {
		getExpressions1().remove(expressions1);
		expressions1.setExpression1(null);

		return expressions1;
	}

	public Operator getOperator2() {
		return this.operator2;
	}

	public void setOperator2(Operator operator2) {
		this.operator2 = operator2;
	}

	public Operator getOperator3() {
		return this.operator3;
	}

	public void setOperator3(Operator operator3) {
		this.operator3 = operator3;
	}

	public Operator getOperator4() {
		return this.operator4;
	}

	public void setOperator4(Operator operator4) {
		this.operator4 = operator4;
	}

	public Expression getExpression2() {
		return this.expression2;
	}

	public void setExpression2(Expression expression2) {
		this.expression2 = expression2;
	}

	public List<Expression> getExpressions2() {
		return this.expressions2;
	}

	public void setExpressions2(List<Expression> expressions2) {
		this.expressions2 = expressions2;
	}

	public Expression addExpressions2(Expression expressions2) {
		getExpressions2().add(expressions2);
		expressions2.setExpression2(this);

		return expressions2;
	}

	public Expression removeExpressions2(Expression expressions2) {
		getExpressions2().remove(expressions2);
		expressions2.setExpression2(null);

		return expressions2;
	}

	public Predicate getPredicate1() {
		return this.predicate1;
	}

	public void setPredicate1(Predicate predicate1) {
		this.predicate1 = predicate1;
	}

	public Predicate getPredicate2() {
		return this.predicate2;
	}

	public void setPredicate2(Predicate predicate2) {
		this.predicate2 = predicate2;
	}

	public List<Rule> getRules1() {
		return this.rules1;
	}

	public void setRules1(List<Rule> rules1) {
		this.rules1 = rules1;
	}

	public Rule addRules1(Rule rules1) {
		getRules1().add(rules1);
		rules1.setExpression1(this);

		return rules1;
	}

	public Rule removeRules1(Rule rules1) {
		getRules1().remove(rules1);
		rules1.setExpression1(null);

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
		rules2.setExpression2(this);

		return rules2;
	}

	public Rule removeRules2(Rule rules2) {
		getRules2().remove(rules2);
		rules2.setExpression2(null);

		return rules2;
	}

}