package com.winter.lang.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentService {

	private String data;

	public StudentService() {
		this.data = "iu-50-58-90-winter-87-85-76-suji-45-55-65";
	}

	public ArrayList<StudentDTO> init() {
		ArrayList<StudentDTO> ar = new ArrayList<>();

		// before: 생성자 안에 public void init() { ... } 메서드를 또 선언했음
		// after: 메서드는 생성자 밖에 따로 선언해야 문법 에러가 나지 않는다.

		// before: for(int i=0,i<ar,length;i++)
		// after: for문의 구분자는 , 가 아니라 ; 를 써야 한다.

		// before: split, StringTokenizer, 출력 코드가 한 메서드 안에서 섞여 있었음
		// after: data를 "-" 기준으로 잘라 StudentDTO 목록으로 만드는 역할만 init()에 모은다.
		StringTokenizer st = new StringTokenizer(this.data, "-");

		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());

			StudentDTO dto = new StudentDTO();
			dto.setName(name);
			dto.setKor(kor);
			dto.setEng(eng);
			dto.setMath(math);

			ar.add(dto);
		}

		return ar;
	}

	public StudentDTO findByName(ArrayList<StudentDTO> ar, String search) {
		if (ar == null) {
			return null;
		}

		for (StudentDTO dto : ar) {
			if (dto.getName().equalsIgnoreCase(search)) {
				return dto;
			}
		}

		return null;
	}
}
