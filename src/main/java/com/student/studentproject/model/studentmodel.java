package com.student.studentproject.model;

public class studentmodel{
	private Integer id;
	private String  name;
	private String email;
	private String password;
	private Integer phonenumber;
	private String  role;
	public studentmodel(Integer id, String name, String email, String password, Integer phonenumber, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
		this.role = role;
	}
	public studentmodel() {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "studentmodel [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", phonenumber=" + phonenumber + ", role=" + role + "]";
	}
	
	
	
}
