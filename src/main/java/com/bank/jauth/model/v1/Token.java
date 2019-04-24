package com.bank.jauth.model.v1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Token {
	@Id
	@GeneratedValue
	private String token;
	@Column(nullable = false)
	private long userId;

	public Token() {

	}

	public Token(long userId, String token) {
		super();
		this.userId = userId;
		this.token = token;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId() {
		this.userId = userId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
