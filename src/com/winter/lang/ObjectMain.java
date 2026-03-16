package com.winter.lang;

public class ObjectMain {
	
	public static void main(String[] args) {
		//모든 클래스의 상속에서 root는 Object이다.
		//모든 클래스는 Object type이다.
		
		String name="winter";
		
		
		Object obj = name;
		
		Object obj1 = new Object();
		boolean check = obj1.equals(obj1);
		
		System.out.println(check);
		String st = obj1.toString();
		System.out.println(st);
		
	}

}
