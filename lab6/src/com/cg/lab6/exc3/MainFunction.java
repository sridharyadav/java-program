package com.cg.lab6.exc3;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter String:");
		 String s1=scan.nextLine();
		 MirrorImageOfString obj=new MirrorImageOfString();
		 System.out.println(obj.getImage(s1));
		 scan.close(); 
	}

}
