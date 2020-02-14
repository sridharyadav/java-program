package com.cg.lab1.exc2;


public class SumOfSquare {
		
		public int n,sum=0;
		public int calculateDifference(int n)
		{
			int s=(n*(n+1))/2;
			int sum=s*s;
			int k=(n*(n+1)*((2*n)+1))/6;
			int	totalsum=sum-k;
			return totalsum;
		}
		    
	}