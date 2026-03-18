package Star;

public class StarMain {
	
	/*
	 * [오류 원인 해설]
	 * 원래 코드에는 main 메서드 내부에 "public void work()" 같은 또 다른 메서드가 정의되어 있었고,
	 * "public class StarMain"이 파일 중간에 또 등장하는 등 구조가 심각하게 깨져 있었습니다.
	 * 메인 함수 안에서는 오직 객체를 만들고 호출하는 일만 해야 합니다.
	 */

	public static void main(String[] args) {
		
		Drone d1 = new Drone();
		d1.name = "드론1호";
		d1.hp = 40;
		d1.color = "노란색";
		
		System.out.println("--- " + d1.name + " 생성 ---");
		d1.info();
		d1.work();
	}
}
