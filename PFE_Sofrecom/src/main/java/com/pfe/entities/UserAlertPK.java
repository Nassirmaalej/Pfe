package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the user_alert database table.
 * 
 */
@Embeddable
public class UserAlertPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String user;

	@Column(name="alert_id", insertable=false, updatable=false)
	private int alertId;

	public UserAlertPK() {
	}
	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getAlertId() {
		return this.alertId;
	}
	public void setAlertId(int alertId) {
		this.alertId = alertId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserAlertPK)) {
			return false;
		}
		UserAlertPK castOther = (UserAlertPK)other;
		return 
			this.user.equals(castOther.user)
			&& (this.alertId == castOther.alertId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.user.hashCode();
		hash = hash * prime + this.alertId;
		
		return hash;
	}
}