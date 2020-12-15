package com.hcl.hms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "patient_details")
public class Patient implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int ID;

	@Column(name = "fname")
	@Size(min = 1, max = 10)
	@NotNull(message = "Please enter your First Name")
	private String firstName;

	@Size(max = 10)
	@Column(name = "lname")
	@NotNull(message = "Please enter your Last Name")
	private String lastName;

	@Column(name = "pwd")
	@Size(min = 5, max = 10)
	@NotNull(message = "Please enter your Password")
	private String password;

	@Column(name = "dob")
	@NotNull(message = "Please enter your DOB")
	private String DOB;

	@Column(name = "email", unique = true, nullable = false, length = 50)
	@NotNull
	private String email;

	@Column(name = "number")
	@NotNull(message = "Please enter your Number")
	private Long number;

	@Column(name = "state")
	@NotNull(message = "Please enter your State")
	private String state;

	@Column(name = "insurance_plan")
	@NotNull(message = "Please enter your Insurance Plan")
	private String insurancePlan;

	public Patient() {
		super();

	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

}
