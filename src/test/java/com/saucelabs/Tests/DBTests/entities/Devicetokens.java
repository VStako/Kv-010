// default package
// Generated 20.08.2015 13:23:16 by Hibernate Tools 4.3.1
package com.saucelabs.Tests.DBTests.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Devicetokens generated by hbm2java
 */
@Entity
@Table(name = "devicetokens", catalog = "enviromap")
public class Devicetokens implements java.io.Serializable {

	private String token;

	public Devicetokens() {
	}

	public Devicetokens(String token) {
		this.token = token;
	}

	@Id
	@Column(name = "token", unique = true, nullable = false, length = 200)
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}