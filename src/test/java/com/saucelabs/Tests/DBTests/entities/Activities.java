package com.saucelabs.Tests.DBTests.entities;// default package
// Generated 20.08.2015 13:23:16 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Activities generated by hbm2java
 */
@Entity
@Table(name = "activities", catalog = "enviromap")
public class Activities implements java.io.Serializable {

	private Integer id;
	private Activitytypes activitytypes;
	private Problems problems;
	private Users users;
	private String content;
	private Date date;

	public Activities() {
	}

	public Activities(Activitytypes activitytypes, Problems problems) {
		this.activitytypes = activitytypes;
		this.problems = problems;
	}

	public Activities(Activitytypes activitytypes, Problems problems,
			Users users, String content, Date date) {
		this.activitytypes = activitytypes;
		this.problems = problems;
		this.users = users;
		this.content = content;
		this.date = date;
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
	@JoinColumn(name = "ActivityTypes_Id", nullable = false)
	public Activitytypes getActivitytypes() {
		return this.activitytypes;
	}

	public void setActivitytypes(Activitytypes activitytypes) {
		this.activitytypes = activitytypes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Problems_Id", nullable = false)
	public Problems getProblems() {
		return this.problems;
	}

	public void setProblems(Problems problems) {
		this.problems = problems;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Users_Id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "Content", length = 500)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date", length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
