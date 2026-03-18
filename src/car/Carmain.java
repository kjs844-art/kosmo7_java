package car;

public class Carmain {
	
	/*
	 * [오류 원인 해설]
	 * 원래 코드는 메인(main) 함수 안에서 'public car(String model)' 같은 
	 * 생성자나 클래스 구조를 정의하려고 시도했습니다. 
	 * 메인 함수 안에서는 오직 '실행' 코드만 작성할 수 있으며, 구조 설계는 Car.java에서 해야 합니다.
	 */
	
	public static void main(String[] args) {
		
		// 1. Car 객체 생성 (기본 생성자 사용)
		Car car1 = new Car(); 
		
		// 2. 정보 출력
		System.out.println("--- 자동차 기본 정보 ---");
		car1.info();
		
		// 3. 수동으로 변경 후 정보 출력
		System.out.println("\n--- 튜닝 후 자동차 정보 ---");
		car1.manual = true; // 수동으로 변경
		car1.info();
		
		// 4. 새로운 매개변수 생성자를 이용한 차 생성 테스트
		System.out.println("\n--- 새로운 모델 생성 ---");
		Car car2 = new Car("아반떼", 25000000);
		car2.info();
	}
}
