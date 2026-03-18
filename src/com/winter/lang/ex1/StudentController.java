package com.winter.lang.ex1;

import java.util.Scanner;

public class StudentController {

	public void start() {
		// 키보드 입력을 받기 위한 Scanner 생성
		Scanner sc = new Scanner(System.in);
		// 학생 데이터 처리 담당 객체 생성
		StudentService ss = new StudentService();
		// 학생 데이터 출력 담당 객체 생성
		StudentView sv = new StudentView();
		// 학생 배열을 저장할 변수 선언
		StudentDTO[] ar = null;
		// 반복문을 계속 돌릴지 결정하는 변수
		boolean flag = true;

		// 사용자가 종료를 선택할 때까지 반복
		while (flag) {
			// 메뉴 출력
			System.out.println("1.학생정보 초기화 2.학생정보출력 3.학생정보검색 4.종료");
			// 메뉴 번호 입력
			int select = sc.nextInt();

			// 1번이면 문자열 데이터를 학생 배열로 초기화
			if (select == 1) {
				ar = ss.init();
				System.out.println("학생 정보가 초기화되었습니다.");
			// 2번이면 전체 학생 출력
			} else if (select == 2) {
				sv.view(ar);
			// 3번이면 이름으로 학생 검색
			} else if (select == 3) {
				System.out.println("검색할 이름 입력");
				String name = sc.next();
				StudentDTO dto = ss.findByName(ar, name);
				sv.view(dto);
			// 나머지는 종료 처리
			} else {
				flag = false;
			}
		}

		// Scanner 사용 종료
		sc.close();
	}

	public static void main(String[] args) {
		// 프로그램 시작
		new StudentController().start();
	}
}
