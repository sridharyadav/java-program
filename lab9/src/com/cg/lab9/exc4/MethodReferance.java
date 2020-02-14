package com.cg.lab9.exc4;
interface A{
	public int say();
}
public class MethodReferance {
	private int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public static void main(String args[]) {
		MethodReferance obj = new MethodReferance();
		obj.setB(6);
		A obj1=obj::getB;
		obj1.say();
	}

}
