package com.example.freemarker.model;

import java.util.List;
import java.util.Map;

public class Employee {

	private int empId;

	private String empName;

	private Map<String, List<String>> skills;

	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Map<String, List<String>> getSkills() {
		return skills;
	}

	public void setSkills(Map<String, List<String>> skills) {
		this.skills = skills;
	}

}
