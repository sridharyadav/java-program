package com.cg.lab10.exc1;
import java.util.ArrayList;

public class EmployeeService {
	public static void main(String args[]) {
		EmployeeRepository obj =new EmployeeRepository();
		ArrayList<Employee> myAl = obj.method1();
		System.out.println(myAl);
		//double sum=myAl.stream().map(x->x.salary).reduce(0.0,(double)((a,b)->a+b));
		
	}

}
