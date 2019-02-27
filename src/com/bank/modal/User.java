package com.bank.modal;

import java.io.Serializable;

public class User implements Serializable {
private String firstname;
private String lastname;
private Long aadharNo;
private Long accNo;
private String accType;
private String panCard;
private Long phNo;
private String address;
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
public Long getAadharNo() {
	return aadharNo;
}
public void setAadharNo(Long aadharNo) {
	this.aadharNo = aadharNo;
}
public Long getAccNo() {
	return accNo;
}
public void setAccNo(Long accNo) {
	this.accNo = accNo;
}
public String getAccType() {
	return accType;
}
public void setAccType(String accType) {
	this.accType = accType;
}
public String getPanCard() {
	return panCard;
}
public void setPanCard(String panCard) {
	this.panCard = panCard;
}
public Long getPhNo() {
	return phNo;
}
public void setPhNo(Long phNo) {
	this.phNo = phNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
