package Study;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

	public void start() {
		// 메뉴 번호를 입력받기 위한 Scanner
		Scanner sc = new Scanner(System.in);
		// 실제 데이터 처리 담당
		StudentService ss = new StudentService();
		// 출력 담당
		StudentView sv = new StudentView();

		// true인 동안 메뉴를 계속 반복
		boolean flag = true;
		// 학생 목록은 아직 없으므로 null로 시작
		ArrayList<StudentDTO> ar = null;

		while (flag) {
			System.out.println("1. 학생정보초기화");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생추가");
			System.out.println("5. 종 료");
			int select = sc.nextInt();

			if (select == 1) {
				// 문자열 데이터를 읽어서 학생 목록을 만든다.
				ar = ss.init();
			} else if (select == 2) {
				// 현재 학생 목록 전체를 출력한다.
				sv.view(ar);
			} else if (select == 3) {
				if (ar == null) {
					System.out.println("먼저 학생정보초기화를 하세요.");
				} else {
					// 검색 결과 학생 1명을 받아 온다.
					StudentDTO studentDTO = ss.search(ar);
					if (studentDTO != null) {
						sv.view(studentDTO);
					} else {
						System.out.println("찾는 학생이 없다");
					}
				}
			} else if (select == 4) {
				if (ar == null) {
					// 초기화를 안 했더라도 추가는 가능하게 빈 목록을 만든다.
					ar = new ArrayList<StudentDTO>();
				}
				// 입력받은 학생 1명을 목록에 추가한다.
				ss.add(ar);
			} else {
				// 5번이면 반복 종료
				flag = false;
			}
		}
	}
}
