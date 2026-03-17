package com.winter.lang.ex3;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		// before:
		// System.out.println("...");
		// after: 실행문은 클래스 바로 아래가 아니라 main() 같은 메서드 안에 있어야 한다.
		WrapperService service = new WrapperService();
		Scanner sc = new Scanner(System.in);

		service.ageCount(sc);

		sc.close();
	}
}
