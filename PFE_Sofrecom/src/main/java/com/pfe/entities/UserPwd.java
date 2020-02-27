package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_pwd database table.
 * 
 */
@Entity
@Table(name="user_pwd")
@NamedQuery(name="UserPwd.findAll", query="SELECT u FROM UserPwd u")
public class UserPwd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String name;

	private String pass;

	public UserPwd() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}