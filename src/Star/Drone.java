package Star;

public class Drone {
	
	/*
	 * [오류 원인 해설]
	 * 원래 코드: protected int 
	 * 변수 이름이 명시되지 않은 상태로 줄이 끝나서 문법 에러가 발생했습니다.
	 * 제대로 된 자료형과 변수명(hp, color, name 등)을 선언해주어야 합니다.
	 */

	public int hp;
	public String color;
	public String name;
	
	// 기본 정보 출력 메서드
	public void info() {
		System.out.println("이름: " + name + " / 체력: " + hp + " / 색상: " + color);
	}

	public void work() {
		System.out.println("드론이 미네랄을 채취합니다.");
	}
}
