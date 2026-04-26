package com.student.studentproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String sname;
	private String email;
	private String spassword;
	private Integer phonenumber;
	private String  srole;
	public StudentEntity(Integer id, String name, String email, String password, Integer phonenumber, String role) {
		super();
		this.id = id;
		this.sname = name;
		this.email = email;
		this.spassword = password;
		this.phonenumber = phonenumber;
		this.srole = role;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return sname;
	}
	public void setName(String name) {
		this.sname = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return spassword;
	}
	public void setPassword(String password) {
		this.spassword = password;
	}
	public Integer getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getRole() {
		return srole;
	}
	public void setRole(String role) {
		this.srole = role;
	}
	@Override
	public String toString() {
		return "studentmodel [id=" + id + ", name=" + sname + ", email=" + email + ", password=" + spassword
				+ ", phonenumber=" + phonenumber + ", role=" + srole + "]";
	}
	
	
	

}
