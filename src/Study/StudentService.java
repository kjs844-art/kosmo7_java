package Study;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {

	// 학생 정보를 한 줄 문자열로 미리 저장한 변수
	private String data;
	// 검색/추가 때 계속 재사용할 입력 객체
	private Scanner sc;

	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
		this.sc = new Scanner(System.in);
	}

	public ArrayList<StudentDTO> init() {
		// data를 "-" 기준으로 잘라내는 도구
		StringTokenizer st = new StringTokenizer(this.data, "-");
		// 잘라낸 학생들을 담을 목록
		ArrayList<StudentDTO> ar = new ArrayList<StudentDTO>();

		// 토큰이 남아 있으면 학생 1명씩 계속 생성
		while (st.hasMoreTokens()) {
			System.out.println("====================");

			// 학생 한 명 정보를 담을 객체 생성
			StudentDTO dto = new StudentDTO();

			// 첫 번째 값은 이름
			String s1 = st.nextToken();
			dto.setName(s1);

			// 두 번째 값은 국어 점수
			String s2 = st.nextToken();
			dto.setKor(Integer.parseInt(s2));

			// 세 번째 값은 영어 점수
			String s3 = st.nextToken();
			dto.setEng(Integer.parseInt(s3));

			// 네 번째 값은 수학 점수
			String s4 = st.nextToken();
			dto.setMath(Integer.parseInt(s4));

			// 완성된 학생을 목록에 추가
			ar.add(dto);
		}

		System.out.println("====================");
		// 완성된 학생 목록 반환
		return ar;
	}

	// 학생 검색하는 메서드
	public StudentDTO search(ArrayList<StudentDTO> ar) {
		System.out.println("학생 이름 검색");
		String name = sc.next();

		// ArrayList는 length가 아니라 size()를 사용
		for (int i = 0; i < ar.size(); i++) {
			// ArrayList는 ar[i]가 아니라 get(i)로 꺼낸다.
			if (name.equals(ar.get(i).getName())) {
				return ar.get(i);
			}
		}

		// 못 찾으면 null 반환
		return null;
	}

	// 학생을 추가하는 메서드
	public void add(ArrayList<StudentDTO> ar) {
		// 새 학생 1명을 담을 빈 객체
		StudentDTO dto = new StudentDTO();

		System.out.println("이름 입력");
		dto.setName(sc.next());

		System.out.println("국어 입력");
		dto.setKor(sc.nextInt());

		System.out.println("영어 입력");
		dto.setEng(sc.nextInt());

		System.out.println("수학 입력");
		dto.setMath(sc.nextInt());

		// 입력이 끝난 학생 객체를 목록에 추가
		ar.add(dto);
		System.out.println("학생 추가 완료");
	}
}
