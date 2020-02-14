package com.cg.lab10.exc1;
import java.util.*;

public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Date LocalDate;
	private String designation;
	private Double salary ;
	private int managerId;
	Department dep;
	public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber, Date localDate,
			String designation, Double salary, int managerId, Department dep) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		LocalDate = localDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.dep = dep;
	}



	

}
