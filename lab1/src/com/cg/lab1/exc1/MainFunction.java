package com.cg.lab1.exc1;
import java.util.Scanner;

public class MainFunction {
	
		public static void main(String[] args) {
			SumOfNumber obj = new SumOfNumber();
	    	int s;
	    	System.out.println("Enter");	
	    	Scanner sc=new Scanner(System.in);
	    	s=sc.nextInt();
	    	System.out.println(obj.calculateSum(s));
	    	sc.close();
	      }

		}
