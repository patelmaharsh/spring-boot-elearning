package com.Amdocs.elearning.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fId;
	private int userId;
	private String name;
	private String email;
	private String feedback;
	
	public Feedback() {
		super();
	}
	public Feedback(int fId, int userId, String name, String email, String feedback) {
		super();
		this.fId = fId;
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.feedback = feedback;
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Feedback [fId=" + fId + ", userId=" + userId + ", name=" + name + ", email=" + email + ", feedback="
				+ feedback + "]";
	}
	
}
