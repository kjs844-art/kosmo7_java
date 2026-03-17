package com.winter.lang.ex1;

import java.util.ArrayList;

public class StudentView {

	// before: public void view(ArrayList<StudentDTO> ar)
	// after: 메서드는 선언만 하면 안 되고 { } 본문이 있어야 한다.
	public void view(ArrayList<StudentDTO> ar) {
		if (ar == null || ar.isEmpty()) {
			System.out.println("출력할 학생 정보가 없습니다.");
			return;
		}

		System.out.println("========== 학생 성적 결과 ==========");
		for (StudentDTO dto : ar) {
			System.out.println(dto);
		}
	}

	public void view(StudentDTO dto) {
		if (dto == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}

		System.out.println(dto);
	}
}
