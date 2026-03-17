package com.winter.lang.ex3;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		// Executable statements must be inside a method like main().
		WrapperService service = new WrapperService();
		Scanner sc = new Scanner(System.in);

		service.ageCount(sc);

		sc.close();
	}
}
