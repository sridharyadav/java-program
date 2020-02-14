package com.cg.lab1.exc1;

public class SumOfNumber {
	
	public int n,sum=0;
		
	public int calculateSum(int n)
		
	    { 
			for (int i=0;i<=n;i++)
			{
				if(i%3==0 || i%5==0)
				{
					sum =sum+i;
				}
			 } 
			return sum;
		}
}