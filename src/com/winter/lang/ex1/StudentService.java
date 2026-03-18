package com.winter.lang.ex1;

import java.util.StringTokenizer;

public class StudentService {

	private String data;

	public StudentService() {
		this.data = "iu-50-58-90-winter-87-85-76-suji-45-55-65";
	}

	public StudentDTO[] init() {
		// data를 "-" 기준으로 잘라내기 위한 객체 생성
		StringTokenizer st = new StringTokenizer(this.data, "-");
		// 학생이 3명이라서 StudentDTO 배열도 3칸 생성
		StudentDTO[] ar = new StudentDTO[3];
		// 배열에 몇 번째 학생을 넣을지 기억하는 변수
		int index = 0;

		// 토큰이 남아 있으면 학생 1명의 데이터를 계속 꺼냄
		while (st.hasMoreTokens()) {
			// 학생 1명의 정보를 담을 객체 생성
			StudentDTO dto = new StudentDTO();
			// 첫 번째 토큰은 이름
			String s1 = st.nextToken();
			// 이름 저장
			dto.setName(s1);
			// 두 번째 토큰은 국어 점수
			String s2 = st.nextToken();
			// 문자열을 정수로 바꿔서 국어 점수 저장
			dto.setKor(Integer.parseInt(s2));
			// 세 번째 토큰은 영어 점수
			String s3 = st.nextToken();
			// 문자열을 정수로 바꿔서 영어 점수 저장
			dto.setEng(Integer.parseInt(s3));
			// 네 번째 토큰은 수학 점수
			String s4 = st.nextToken();
			// 문자열을 정수로 바꿔서 수학 점수 저장
			dto.setMath(Integer.parseInt(s4));
			// 완성된 dto를 배열의 index 위치에 저장
			ar[index] = dto;
			// 다음 학생을 넣기 위해 index 증가
			index++;
		}

		// 학생 정보가 들어 있는 배열 반환
		return ar;
	}

	public StudentDTO findByName(StudentDTO[] ar, String search) {
		// 배열이 없으면 바로 null 반환
		if (ar == null) {
			return null;
		}

		// 배열을 한 칸씩 돌면서 이름 비교
		for (StudentDTO dto : ar) {
			// dto가 null이 아니고 이름이 같으면 그 학생 반환
			if (dto != null && dto.getName().equalsIgnoreCase(search)) {
				return dto;
			}
		}

		// 못 찾았으면 null 반환
		return null;
	}
}
