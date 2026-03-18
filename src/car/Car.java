package car;

public class Car {
	
	// 필드(속성) 선언
	public String company;
	public String model;
	public int price;
	public boolean manual; // true: 수동, false: 자동
	
	/*
	 * [오류 원인 해설]
	 * 1. 생성자 선언 부근에서 중괄호 { } 가 열린 채로 닫히지 않아 코드가 꼬여있었습니다.
	 * 2. 생성자끼리 서로 침범하여 "illegal start of expression" 등의 컴파일 오류가 발생했습니다.
	 * -> 구조를 명확히 분리하여 각괄호 시작과 끝을 맞췄습니다.
	 */

	// 1. 기본 생성자
	public Car() {
		this.company = "현대자동차";
		this.model = "그랜저";
		this.price = 50000000;
		this.manual = false; // 기본값은 자동
	}
	
	// 2. 모델명만 받는 생성자
	public Car(String model) {
		this.company = "현대자동차";
		this.model = model; // 넘겨받은 모델명을 필드에 저장
		this.price = 50000000;
		this.manual = false; 
	}
	
	// 3. 모델명과 가격을 받는 생성자
	public Car(String model, int price) {
		this.company = "현대자동차";
		this.model = model;
		this.price = price;
		this.manual = false; 
	}

	// 정보 출력 메서드
	public void info() {
		System.out.println("제조사: " + company);
		System.out.println("모델명: " + model);
		System.out.println("가격: " + price);
		System.out.println("기어: " + (manual ? "수동" : "자동"));
	}
}
