package com.cg.lab3.exc2;


public class UpperLower {
	public void stringSort(String str[])
	{
		int i,j;
		String temp;
		for(i=0; i<= str.length;i++)
		{
			for(j=i+1;j< str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		
	}
	public void conversion(String str[])
	{
		int n,mid;
		n=str.length;
		mid=n/2;
		for(int i=0;i<str.length;i++)
		{
			if(i<mid)
			{
				str[i]=str[i].toLowerCase();
			}
			else
			{
				str[i]=str[i].toUpperCase();
			}
			
		}
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	}

}