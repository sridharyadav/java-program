package com.cg.lab10.exc1;
import java.util.*;

public class EmployeeRepository  {
	public ArrayList<Employee> method1() {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1,"Sridhar","Bashaveni","Sridhar@gmail.com","51566516",new Date(),"analyst",123455.0,123,new Department(7,"abc",12)));
		list.add(new Employee(2,"aravind","kumar","aravind@gmail.com","545656665",new Date(),"analyst",564165.0,134,new Department(8,"acd",11)));
		return list;
	}
}