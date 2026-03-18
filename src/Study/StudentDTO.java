package Study;

public class StudentDTO {

	// 학생 1명의 데이터를 담는 변수들
	private String name;
	private int kor;
	private int eng;
	private int math;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		// 출력할 때 보기 좋게 문자열로 바꿔 준다.
		return "이름 : " + name + "\n국어 : " + kor + "\n영어 : " + eng + "\n수학 : " + math;
	}
}
