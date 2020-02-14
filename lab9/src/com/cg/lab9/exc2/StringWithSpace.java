package com.cg.lab9.exc2;
interface Spac{
	public String sp(String s);
}

public class StringWithSpace {
	public static void main(String args[]) {
		
		Spac obj=(x)->{String res="";
			
			for(int i=0;i<x.length();i++) {
				res =res+x.charAt(i)+" ";
			}
			return res;
		};
			System.out.println( obj.sp("sridhar"));
		
	}

}
