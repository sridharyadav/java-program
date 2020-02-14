package com.cg.lab9.exc1;

interface A{
	public double power(int x, int y);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = (a,b) ->Math.pow(a,b);
		System.out.println(obj.power(5, 6));
	}

}
