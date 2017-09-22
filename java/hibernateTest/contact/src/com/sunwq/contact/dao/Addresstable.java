package com.sunwq.contact.dao;

/**
 * Addresstable entity. @author MyEclipse Persistence Tools
 */

public class Addresstable implements java.io.Serializable {

	// Fields

	private Integer id;
	private String firstName;
	private String lastName;
	private String jobTitle;
	private String department;
	private String phone;
	private String mobile;
	private String email;

	// Constructors

	/** default constructor */
	public Addresstable() {
	}

	/** full constructor */
	public Addresstable(String firstName, String lastName, String jobTitle,
			String department, String phone, String mobile, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.department = department;
		this.phone = phone;
		this.mobile = mobile;
		this.email = email;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}