package com.cg.lab7.exc4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter Size of student details:");
		 int n=scan.nextInt();
		 HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		 for(int i=0;i<n;i++)
		 {
			 System.out.print("Enter Student Id:");
			   int id=scan.nextInt();
			   System.out.println("Enter Marks of Student:");
			   int marks=scan.nextInt();
			   hm.put(id, marks);
		 }
		 MedalsToStudents mts=new MedalsToStudents();
		 HashMap<Integer,String> output=mts.getStudents(hm);
		 for(Map.Entry<Integer,String> me:output.entrySet())
		 {
			 System.out.println(me.getKey()+"-->"+me.getValue());
		 }
		scan.close();

	}

}