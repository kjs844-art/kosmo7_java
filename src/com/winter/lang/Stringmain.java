package com.winter.lang;

import java.util.Scanner;

// before: 파일명은 Stringmain.java 였는데 클래스명은 StringMain 이었음
// after: public class 이름과 파일명은 반드시 같아야 해서 StringMain.java 로 맞췄다.
public class StringMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = "winter";

		char ch = name.charAt(3);
		System.out.println(ch);

		Object obj = new Object();

		String s1 = obj.toString();
		String s2 = name.toString();

		System.out.println(obj);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(name);

		String s3 = sc.toString();
		System.out.println(s3);

		Object obj2 = new Object();

		boolean c = obj.equals(obj2);
		System.out.println(c);

		String name2 = "winter";
		c = name.equals(name2);
		System.out.println(c);

		name2 = "Winter";
		c = name.equals(name2);
		System.out.println(c);

		c = name.equalsIgnoreCase(name2);
		System.out.println(c);
	}
}
