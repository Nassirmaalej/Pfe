package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_alert database table.
 * 
 */
@Entity
@Table(name="user_alert")
@NamedQuery(name="UserAlert.findAll", query="SELECT u FROM UserAlert u")
public class UserAlert implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	

	private UserAlertPK id;
	@ManyToOne
	@JoinColumn(name="alert_id",insertable=false, updatable=false)
	//bi-directional many-to-one association to Alert

	private Alert alert;

	public UserAlert() {
	}

	public UserAlertPK getId() {
		return this.id;
	}

	public void setId(UserAlertPK id) {
		this.id = id;
	}

	public Alert getAlert() {
		return this.alert;
	}

	public void setAlert(Alert alert) {
		this.alert = alert;
	}

}