package com.example.demo.usermgmtentity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_master")
public class UserMaster {

	@Id
	@GeneratedValue
	private Integer userid;

	private String fname;

	private String lname;

	private String email;

	private String phonumr;

	private LocalDate date;

	private String gender;

	private String countryId;

	private String stateId;

	private String cityId;

	private String pwd;

	private String accountStatus;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getPhonumr() {
		return phonumr;
	}

	public void setPhonumr(String phonumr) {
		this.phonumr = phonumr;
	}

	@Override
	public String toString() {
		return "UserMaster [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", phonumr=" + phonumr + ", date=" + date + ", gender=" + gender + ", countryId=" + countryId
				+ ", stateId=" + stateId + ", cityId=" + cityId + ", pwd=" + pwd + ", accountStatus=" + accountStatus
				+ "]";
	}

}
