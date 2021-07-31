package com.trustbanc.intranetservice.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_profile")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

//Personal Details
	private String firstname;
	private String lastname;
	private String phonenumber;
	private String address;
	private String stateoforigin;
	private String stateofresidence;
	private String gender;
	private String married;
	@Column(nullable = false, unique = true, length = 45)
	private String email;
	private Date birthdate;

	// Work Details
	private Date enlistmentdate;
	private String designation;
	private String ippisnumber;
	private String bvnnumber;

	// Mailing and Terms
	private boolean terms;
	private boolean mailing;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStateoforigin() {
		return stateoforigin;
	}

	public void setStateoforigin(String stateoforigin) {
		this.stateoforigin = stateoforigin;
	}

	public String getStateofresidence() {
		return stateofresidence;
	}

	public void setStateofresidence(String stateofresidence) {
		this.stateofresidence = stateofresidence;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Date getEnlistmentdate() {
		return enlistmentdate;
	}

	public void setEnlistmentdate(Date enlistmentdate) {
		this.enlistmentdate = enlistmentdate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getIppisnumber() {
		return ippisnumber;
	}

	public void setIppisnumber(String ippisnumber) {
		this.ippisnumber = ippisnumber;
	}

	public String getBvnnumber() {
		return bvnnumber;
	}

	public void setBvnnumber(String bvnnumber) {
		this.bvnnumber = bvnnumber;
	}

	public boolean isTerms() {
		return terms;
	}

	public void setTerms(boolean terms) {
		this.terms = terms;
	}

	public boolean isMailing() {
		return mailing;
	}

	public void setMailing(boolean mailing) {
		this.mailing = mailing;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phonenumber="
				+ phonenumber + ", address=" + address + ", stateoforigin=" + stateoforigin + ", stateofresidence="
				+ stateofresidence + ", gender=" + gender + ", married=" + married + ", email=" + email + ", birthdate="
				+ birthdate + ", enlistmentdate=" + enlistmentdate + ", designation=" + designation + ", ippisnumber="
				+ ippisnumber + ", bvnnumber=" + bvnnumber + ", terms=" + terms + ", mailing=" + mailing + "]";
	}
}