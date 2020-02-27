package com.pfe.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the alert database table.
 * 
 */
@Entity
@NamedQuery(name="Alert.findAll", query="SELECT a FROM Alert a")
public class Alert implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="alert_type")
	private String alertType;

	@Column(name="alert_user")
	private String alertUser;

	private String description;

	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="update_date")
	private Date updateDate;

	//bi-directional many-to-one association to UserAlert
	@OneToMany(mappedBy="alert")
	private List<UserAlert> userAlerts;

	public Alert() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlertType() {
		return this.alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}

	public String getAlertUser() {
		return this.alertUser;
	}

	public void setAlertUser(String alertUser) {
		this.alertUser = alertUser;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public List<UserAlert> getUserAlerts() {
		return this.userAlerts;
	}

	public void setUserAlerts(List<UserAlert> userAlerts) {
		this.userAlerts = userAlerts;
	}

	public UserAlert addUserAlert(UserAlert userAlert) {
		getUserAlerts().add(userAlert);
		userAlert.setAlert(this);

		return userAlert;
	}

	public UserAlert removeUserAlert(UserAlert userAlert) {
		getUserAlerts().remove(userAlert);
		userAlert.setAlert(null);

		return userAlert;
	}

}