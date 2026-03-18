package Study;

import java.util.ArrayList;

public class StudentView {

	public void view(ArrayList<StudentDTO> ar) {
		if (ar == null || ar.size() == 0) {
			System.out.println("출력할 학생 정보가 없습니다.");
			return;
		}

		// 목록 전체를 한 명씩 꺼내서 출력
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

	public void view(StudentDTO dto) {
		if (dto == null) {
			System.out.println("찾는 학생이 없다");
			return;
		}

		// 학생 1명만 출력
		System.out.println(dto);
	}
}
