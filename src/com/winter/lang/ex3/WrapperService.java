package com.winter.lang.ex3;

import java.util.Scanner;

public class WrapperService {

	public void ageCount2(Scanner sc) {
		System.out.println("주민번호 입력: xxxxxx-1234567");
		String data = sc.next();

		String yearText = data.substring(0, 2);
		int birthYear = Integer.parseInt(yearText);
		int code = Integer.parseInt(data.substring(7, 8));

		if (code == 1 || code == 2) {
			birthYear += 1900;
		} else if (code == 3 || code == 4) {
			birthYear += 2000;
		}

		int age = 2026 - birthYear;
		System.out.println(data);
		System.out.println("나이: " + age);
	}

	public void ageCount(Scanner sc) {
		System.out.println("생년월일 입력: yyyy-mm-dd");
		String data = sc.next();

		int currentYear = 2026;

		String yearText = data.substring(0, 4);
		System.out.println(data);

		String[] ar = data.split("-");
		System.out.println(ar[0] + "-" + ar[1] + "-" + ar[2]);

		int birthYear = Integer.parseInt(yearText);
		int age = currentYear - birthYear;

		System.out.println("나이: " + age);
	}
}
