package com.winter.lang.ex3;

import java.util.Scanner;

public class WrapperService {

	public void ageCount2(Scanner sc) {
		System.out.println("주민번호 입력: xxxxxx-1234567");
		String data = sc.next();

		// before: data.substring(0)
		// after: 끝 인덱스와 ; 를 같이 써야 문법 에러가 나지 않는다.
		String yearText = data.substring(0, 2);
		int birthYear = Integer.parseInt(yearText);
		int code = Integer.parseInt(data.substring(7, 8));

		// before: if(c==1 [] c==2)
		// after: 조건 OR 비교는 || 를 써야 한다. [] 는 조건식에서 사용할 수 없다.
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

		// before: System.out.println(yearText);
		// after: yearText는 나이 계산용으로 두고, 화면에는 입력한 날짜 전체를 출력한다.
		String yearText = data.substring(0, 4);
		System.out.println(data);

		// before: System.out.println(ar[0]);
		// after: split으로 나눈 값을 다시 붙이면 전체 날짜 형태를 다시 볼 수 있다.
		String[] ar = data.split("-");
		System.out.println(ar[0] + "-" + ar[1] + "-" + ar[2]);

		int birthYear = Integer.parseInt(yearText);
		int age = currentYear - birthYear;

		System.out.println("나이: " + age);
	}
}
