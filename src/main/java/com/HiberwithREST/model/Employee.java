package com.HiberwithREST.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer empId;

private String empName;
private String empUserName;
private String empPassword;
private String empAdd;
private String empEmail;
private Double empSal;
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpUserName() {
	return empUserName;
}
public void setEmpUserName(String empUserName) {
	this.empUserName = empUserName;
}
public String getEmpPassword() {
	return empPassword;
}
public void setEmpPassword(String empPassword) {
	this.empPassword = empPassword;
}
public String getEmpAdd() {
	return empAdd;
}
public void setEmpAdd(String empAdd) {
	this.empAdd = empAdd;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
public Double getEmpSal() {
	return empSal;
}
public void setEmpSal(Double empSal) {
	this.empSal = empSal;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empUserName=" + empUserName + ", empPassword="
			+ empPassword + ", empAdd=" + empAdd + ", empEmail=" + empEmail + ", empSal=" + empSal + "]";
}


}
