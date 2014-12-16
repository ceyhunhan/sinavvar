package com.sinavvar.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="CLIENT")
public class User {
	
	@Id
	@Column(name="ID")
	@GeneratedValue
	private Long id;
    
	@Column(name="FIRSTNAME")
	private String firstname;

	@NotEmpty
	@Column(name="LASTNAME")
	private String lastname;

	@NotEmpty
	@Email
	@Column(name="EMAIL")
	private String email;
	
	@NotEmpty
	@Column(name="TELEPHONE")
	private String telephone;
	
	@javax.validation.constraints.NotNull
	@Column(name="BIRTHDAY")
	private Date birthDay;
	
	@NotEmpty
	@Column(name="ADDRESS")
	private String address;
	
	public String getEmail() {
		return email;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
