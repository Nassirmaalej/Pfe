package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;


import java.util.Date;


/**
 * The persistent class for the rule database table.
 * 
 */
@Entity

@NamedQuery(name="Rule.findAll", query="SELECT r FROM Rule r")
public class Rule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String category;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	private String description;

	@Column(name="LAST_CONTRIBUTOR_CODE_ALLIANCE")
	private String lastContributorCodeAlliance;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="MARKET_SEGMENT_PROFESSION")
	private String marketSegmentProfession;

	private String media;

	private String reason;

	@Column(name="SUB_TYPE")
	private String subType;

	@Temporal(TemporalType.DATE)
	@Column(name="VALIDITY_FIRST_DATE")
	private Date validityFirstDate;

	@Temporal(TemporalType.DATE)
	@Column(name="VALIDITY_LAST_DATE")
	private Date validityLastDate;

	//bi-directional many-to-one association to Expression
	@ManyToOne
	@JoinColumn(name="EXPRESSION_ID",insertable=false, updatable=false)
	

	private Expression expression1;

	//bi-directional many-to-one association to Target
	@ManyToOne
	@JoinColumn(name="TARGET",insertable=false, updatable=false)
	private Target target1;

	//bi-directional many-to-one association to Expression
	@ManyToOne
	@JoinColumn(name="EXPRESSION_ID")
	private Expression expression2;

	//bi-directional many-to-one association to Target
	@ManyToOne
	@JoinColumn(name="TARGET")
	private Target target2;

	public Rule() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLastContributorCodeAlliance() {
		return this.lastContributorCodeAlliance;
	}

	public void setLastContributorCodeAlliance(String lastContributorCodeAlliance) {
		this.lastContributorCodeAlliance = lastContributorCodeAlliance;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getMarketSegmentProfession() {
		return this.marketSegmentProfession;
	}

	public void setMarketSegmentProfession(String marketSegmentProfession) {
		this.marketSegmentProfession = marketSegmentProfession;
	}

	public String getMedia() {
		return this.media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSubType() {
		return this.subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public Date getValidityFirstDate() {
		return this.validityFirstDate;
	}

	public void setValidityFirstDate(Date validityFirstDate) {
		this.validityFirstDate = validityFirstDate;
	}

	public Date getValidityLastDate() {
		return this.validityLastDate;
	}

	public void setValidityLastDate(Date validityLastDate) {
		this.validityLastDate = validityLastDate;
	}

	public Expression getExpression1() {
		return this.expression1;
	}

	public void setExpression1(Expression expression1) {
		this.expression1 = expression1;
	}

	public Target getTarget1() {
		return this.target1;
	}

	public void setTarget1(Target target1) {
		this.target1 = target1;
	}

	public Expression getExpression2() {
		return this.expression2;
	}

	public void setExpression2(Expression expression2) {
		this.expression2 = expression2;
	}

	public Target getTarget2() {
		return this.target2;
	}

	public void setTarget2(Target target2) {
		this.target2 = target2;//
	}
//
}