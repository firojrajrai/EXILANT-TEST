package com.exilant.to;

public class EmployeeTO {
private int eid;
private String fname;
private String lname;
private int age;
private long phone;
private String email;
private String gender;
private String  username;
private String password;
public EmployeeTO(int eid, String fname, String lname, int age, long phone, String email, String gender,
		String username, String password) {
	super();
	this.eid = eid;
	this.fname = fname;
	this.lname = lname;
	this.age = age;
	this.phone = phone;
	this.email = email;
	this.gender = gender;
	this.username = username;
	this.password = password;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
	
	
}
