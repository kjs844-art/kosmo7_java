package com.winter.lang.ex1;

public class StudentView {

	public void view(StudentDTO[] ar) {
		// 배열이 없거나 비어 있으면 출력할 내용이 없다고 안내
		if (ar == null || ar.length == 0) {
			System.out.println("출력할 학생 정보가 없습니다.");
			return;
		}

		// 제목 출력
		System.out.println("========== 학생 성적 결과 ==========");
		// 배열을 하나씩 꺼내서 출력
		for (StudentDTO dto : ar) {
			// null이 아닌 학생만 출력
			if (dto != null) {
				System.out.println(dto);
			}
		}
	}

	public void view(StudentDTO dto) {
		// 검색 결과가 없으면 안내 후 종료
		if (dto == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}

		// 찾은 학생 1명 출력
		System.out.println(dto);
	}
}
