package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the user_notification database table.
 * 
 */
@Embeddable
public class UserNotificationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String user;

	@Column(name="notification_id", insertable=false, updatable=false)
	private int notificationId;

	public UserNotificationPK() {
	}
	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getNotificationId() {
		return this.notificationId;
	}
	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserNotificationPK)) {
			return false;
		}
		UserNotificationPK castOther = (UserNotificationPK)other;
		return 
			this.user.equals(castOther.user)
			&& (this.notificationId == castOther.notificationId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.user.hashCode();
		hash = hash * prime + this.notificationId;
		
		return hash;
	}
}