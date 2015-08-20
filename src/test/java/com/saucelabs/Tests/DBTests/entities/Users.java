// default package
// Generated 20.08.2015 13:23:16 by Hibernate Tools 4.3.1
package com.saucelabs.Tests.DBTests.entities;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name = "users", catalog = "enviromap")
public class Users implements java.io.Serializable {

	private Integer id;
	private Userroles userroles;
	private String name;
	private String surname;
	private String email;
	private String password;
	private Set<Activities> activitieses = new HashSet<Activities>(0);
	private Set<Photos> photoses = new HashSet<Photos>(0);

	public Users() {
	}

	public Users(Userroles userroles) {
		this.userroles = userroles;
	}

	public Users(Userroles userroles, String name, String surname,
			String email, String password, Set<Activities> activitieses,
			Set<Photos> photoses) {
		this.userroles = userroles;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.activitieses = activitieses;
		this.photoses = photoses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserRoles_Id", nullable = false)
	public Userroles getUserroles() {
		return this.userroles;
	}

	public void setUserroles(Userroles userroles) {
		this.userroles = userroles;
	}

	@Column(name = "Name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Surname", length = 45)
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Column(name = "Email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Password", length = 64)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Activities> getActivitieses() {
		return this.activitieses;
	}

	public void setActivitieses(Set<Activities> activitieses) {
		this.activitieses = activitieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Photos> getPhotoses() {
		return this.photoses;
	}

	public void setPhotoses(Set<Photos> photoses) {
		this.photoses = photoses;
	}

}
