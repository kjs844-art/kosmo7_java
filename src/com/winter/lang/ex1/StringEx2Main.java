package com.winter.lang.ex1;

import java.util.Scanner;

// 파일명에서 확장자를 구하고 이미지 파일인지 검사하는 예제
public class StringEx2Main {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		// 사용자에게 파일명 입력 안내
		System.out.println("파일명을 입력하세요");

		// 입력받은 파일명을 fileName 변수에 저장
		String fileName = sc.next();

		// 1. 마지막 . 의 위치 찾기
		// find.abc.png 같은 이름에서도 마지막 점을 찾기 위해 lastIndexOf 사용
		int idx = fileName.lastIndexOf(".");
		System.out.println(idx);

		// 2. 점 다음의 문자열을 잘라서 확장자만 꺼내기
		String name = fileName.substring(idx + 1);
		System.out.println(name);

		// 3. if / else if 로 이미지 파일인지 검사
		if (name.equalsIgnoreCase("png")) {
			System.out.println("이미지다");
		} else if (name.equalsIgnoreCase("gif")) {
			System.out.println("이미지다");
		} else if (name.equalsIgnoreCase("jiff")) {
			// 선생님 코드 흐름 유지
		} else {
			System.out.println("이미지가 아니다");
		}

		// 배열로 여러 확장자를 한 번에 검사하는 방법
		String[] files = { "jpg", "gif", "png", "jpeg", "jiff" };

		String result = "이미지 파일이 아니다";

		for (int i = 0; i < files.length; i++) {
			if (name.equalsIgnoreCase(files[i])) {
				result = "이미지 파일 입니다";
				break;
			}
		}

		System.out.println(result);
		sc.close();
	}

}
