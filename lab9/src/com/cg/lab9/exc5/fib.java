package com.cg.lab9.exc5;
interface A{
	public void say(int b);
}

public class  fib {
	int z;
	public void fibno(int c) {
		int a=1;
		int b=1;
		
		for(int i=1;i<c-1;i++) {
			z=a+b;
			a=b;
			b=z;
		}
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib obj=new fib();
		
		A obj1 = obj::fibno;
		obj1.say(7);

	}

}
