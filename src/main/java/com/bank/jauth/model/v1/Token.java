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
	private long id;
	@GeneratedValue
	private String token;
	@Column(nullable = false)
	private long userId;

	public Token() {

	}

	public Token(long id, String token) {
		super();
		this.id = id;
		this.token = token;
	}

	public long getid() {
		return id;
	}

	public void setid() {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Token{" +
				"token='" + token + '\'' +
				", id=" + id +
				'}';
	}
}
