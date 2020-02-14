package com.cg.lab9.exc3;
import java.util.*;
interface A{
	public boolean user(String username, String password);
}

public class LamdaBoolean {
	public static void main(String args[]) {
		
		A obj1 = (u,s)->{
			Map<String, String> obj =new HashMap<String, String >();
			obj.put("sridhar", "sridhar");
			obj.put("dhanu","dhanu");
			boolean flag = false;
			for(Map.Entry<String, String> obj2:obj.entrySet()) {
				if(u.equals(obj2.getKey()) && s.contentEquals(obj2.getValue())) {
					flag = true;
				}
				
			}
			return flag;
		};
		Scanner sc= new Scanner(System.in);
		System.out.println("username");
		String username = sc.next();
		System.out.println("password");
		String password = sc.next();
		System.out.println(obj1.user(username,password));
		sc.close();
	}
	


}
