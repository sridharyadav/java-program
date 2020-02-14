package com.cg.lab2.exc1;

import java.util.Scanner;
import java.util.*;

public abstract class ReturnItem extends Items {
	
    ArrayList<Integer >obj=new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);
	private String Author;

	public ReturnItem(String itemName, int itemNo, int noOfCopies)
	{
		
		
		super(itemName,itemNo,noOfCopies);
		
		
		
	}

	public void setAuthor(String author) {
		Author = author;
	}
	
	public String getAuthor() {
		
		return Author;
	}
	
	public void print()
	{
		
		super.print();
		
		System.out.println("author name is"+getAuthor());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
