package org;
//import java.util.*;

public class TeacherPOJO 
{
	String firstname = "";
	String lastname = "";
	String phone = "";
	String email = "";
	String subject = "";
	String qualification = "";
	String address = "";
	String dob = "";
	int experience = 0;
	String hobby = "";
	String additional_qualification = "";
	String password = "";
	int approved = 0;
	int delete = 0;
	int id = 0;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public TeacherPOJO(String firstname, String lastname, String phone, String email, String subject, String qualification,
			String address, String dob, int experience, String hobby, String additional_qualification, String password, 
			int approved, int id) 
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.subject = subject;
		this.qualification = qualification;
		this.address = address;
		this.dob = dob;
		this.experience = experience;
		this.hobby = hobby;
		this.additional_qualification = additional_qualification;
		this.password = password;
		this.approved = approved;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getAdditional_qualification() {
		return additional_qualification;
	}
	public void setAdditional_qualification(String additional_qualification) {
		this.additional_qualification = additional_qualification;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getApproved() {
		return approved;
	}
	public void setApproved(int approved) {
		this.approved = approved;
	}
	public int getDelete() {
		return delete;
	}
	public void setDelete(int delete) {
		this.delete = delete;
	}
	
//	approved = 0 till not approved  approved = 1 till approved
//	delete = 0 not deleted, delete = 1 request deleted
	
	
	
}
