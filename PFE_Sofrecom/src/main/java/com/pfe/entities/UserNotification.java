package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_notification database table.
 * 
 */
@Entity
@Table(name="user_notification")
@NamedQuery(name="UserNotification.findAll", query="SELECT u FROM UserNotification u")
public class UserNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserNotificationPK id;

	//bi-directional many-to-one association to History
	@ManyToOne
	@JoinColumn(name="notification_id",insertable=false, updatable=false)
	private History history;

	public UserNotification() {
	}

	public UserNotificationPK getId() {
		return this.id;
	}

	public void setId(UserNotificationPK id) {
		this.id = id;
	}

	public History getHistory() {
		return this.history;
	}

	public void setHistory(History history) {
		this.history = history;
	}

}