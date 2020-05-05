package com.pfe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="NOM")
	private String Nom;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getSite() {
		return Site;
	}
	public void setSite(String site) {
		Site = site;
	}
	public int getAnciente() {
		return Anciente;
	}
	public void setAnciente(int anciente) {
		Anciente = anciente;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getNumberofcall() {
		return Numberofcall;
	}
	public void setNumberofcall(String numberofcall) {
		Numberofcall = numberofcall;
	}
	@Column(name="Age")
	private int Age;
	@Column(name="Site")
	private String Site;
	@Column(name="Anciente")
	private int Anciente;
	@Column(name="Sex")
	private String Sex;
	@Column(name="Numberofcall")
	private String Numberofcall;
	
	
	
}
