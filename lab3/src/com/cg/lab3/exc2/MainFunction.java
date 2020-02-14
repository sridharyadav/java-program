package com.cg.lab3.exc2;


import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter n");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		String str[] = new String[n];
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		
		UpperLower SC = new UpperLower();
		SC.stringSort(str);
		SC.conversion(str);
		
		}

}