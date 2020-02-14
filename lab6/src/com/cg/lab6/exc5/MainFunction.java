package com.cg.lab6.exc5;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  ModifiedNumber obj=new ModifiedNumber();
		  System.out.println("Enter Number:");
		  String input=scan.nextLine();
		  System.out.println(obj.modifyNumbers(input));
		     scan.close();

	}

}