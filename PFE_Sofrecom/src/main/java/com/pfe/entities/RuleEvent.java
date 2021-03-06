package com.pfe.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RuleEvent {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="LABEL")
	private String label;
	@Column(name="TYPE")
	private String type;
	@Column(name="DETAIL", columnDefinition = "varchar(1512)")
	private String Detail ;
	@Column(name="DATE")
	private String date ;
	
	public String getDate() {
		return date;
	}
	public void setDate(String string) {
		this.date = string;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {          
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDetail() {
		return Detail;
	}
	public void setDetail(String detail) {
		Detail = detail;
	}

}
//
