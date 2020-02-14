package com.cg.lab1.exc4;


public class PowerOfTwo {
	int num;
	public boolean checkPower(int num) { 
		boolean flag = false;
		for(int i=1;i<=num;i++)
		{
			if(Math.pow(2,i)==num)
			{
				flag=true;
				
			}
		} 
			return flag;
	}
}