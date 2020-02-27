package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the history database table.
 * 
 */
@Entity
@NamedQuery(name="History.findAll", query="SELECT h FROM History h")
public class History implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="IMPORT_DATE")
	private Date importDate;

	@Column(name="IMPORT_TYPE")
	private String importType;

	@Column(name="IMPORT_USER")
	private String importUser;

	//bi-directional many-to-one association to UserNotification
	@OneToMany(mappedBy="history")
	private List<UserNotification> userNotifications;

	public History() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getImportDate() {
		return this.importDate;
	}

	public void setImportDate(Date importDate) {
		this.importDate = importDate;
	}

	public String getImportType() {
		return this.importType;
	}

	public void setImportType(String importType) {
		this.importType = importType;
	}

	public String getImportUser() {
		return this.importUser;
	}

	public void setImportUser(String importUser) {
		this.importUser = importUser;
	}

	public List<UserNotification> getUserNotifications() {
		return this.userNotifications;
	}

	public void setUserNotifications(List<UserNotification> userNotifications) {
		this.userNotifications = userNotifications;
	}

	public UserNotification addUserNotification(UserNotification userNotification) {
		getUserNotifications().add(userNotification);
		userNotification.setHistory(this);

		return userNotification;
	}

	public UserNotification removeUserNotification(UserNotification userNotification) {
		getUserNotifications().remove(userNotification);
		userNotification.setHistory(null);

		return userNotification;
	}

}