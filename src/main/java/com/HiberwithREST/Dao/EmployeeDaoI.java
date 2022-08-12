package com.HiberwithREST.Dao;

import java.util.List;

import com.HiberwithREST.model.Employee;



public interface EmployeeDaoI {

	public Integer saveEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee updateEmployee(Employee employee);
	public Employee loginCheck(Integer id,String password);
	public Boolean deletebyId(Integer id);
	public void  deleteAll();
	
}
