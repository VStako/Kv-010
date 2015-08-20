// default package
// Generated 20.08.2015 13:23:16 by Hibernate Tools 4.3.1
package com.saucelabs.Tests.DBTests.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * News generated by hbm2java
 */
@Entity
@Table(name = "news", catalog = "enviromap")
public class News implements java.io.Serializable {

	private Integer id;
	private String content;

	public News() {
	}

	public News(String content) {
		this.content = content;
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

	@Column(name = "Content", nullable = false, length = 10000)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
