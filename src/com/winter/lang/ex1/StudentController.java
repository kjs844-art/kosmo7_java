package com.winter.lang.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

	public void start() {
		Scanner sc = new Scanner(System.in);
		// before: StudentService ss = new Student;
		// after: 클래스명 뒤에 생성자 () 를 붙여서 객체를 생성해야 한다.
		StudentService ss = new StudentService();

		// before: StudentView 만 적고 변수 생성이 끝나지 않았음
		// after: 화면 출력용 객체도 정상적으로 생성한다.
		StudentView sv = new StudentView();

		ArrayList<StudentDTO> ar = null;

		boolean flag = true;

		while (flag) {
			System.out.println("1.학생정보 초기화 2.학생정보출력 3.학생정보검색 4.종료");
			int select = sc.nextInt();

			if (select == 1) {
				ar = ss.init();
				System.out.println("학생 정보가 초기화되었습니다.");
			} else if (select == 2) {
				sv.view(ar);
			} else if (select == 3) {
				System.out.println("검색할 이름 입력");
				String name = sc.next();
				StudentDTO dto = ss.findByName(ar, name);
				sv.view(dto);
			} else {
				flag = false;
			}
		}

		sc.close();
	}

	public static void main(String[] args) {
		new StudentController().start();
	}
}
