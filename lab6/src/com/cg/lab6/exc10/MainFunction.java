package com.cg.lab6.exc10;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        String userName=scan.nextLine();
        
        ValidateUserName obj=new ValidateUserName();
       boolean isValid= obj.isValid(userName);
        if(isValid)
        	System.out.println("Valid UserName");
        else
        	System.out.println("Not a Valid UserName!!");
       scan.close();
	}

}