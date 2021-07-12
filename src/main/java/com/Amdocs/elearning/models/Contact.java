package com.Amdocs.elearning.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	@Column(nullable = false)
	private int contactId;
	private int userId;
	private String name;
	private String email;
	private long phoneNo;
	private String message;
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
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
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", userId=" + userId + ", name=" + name + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", message=" + message + "]";
	}
	
}
