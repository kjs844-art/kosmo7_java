package Daiso;

public class Daisomain {

	public static void main(String[] args) {

		/*
		 * [원래 Customer.java에 있던 코드들이 여기로 이동된 이유]
		 * Java에서 실행문(변수 선언, 값 할당, 메서드 호출 등)은
		 * 반드시 메서드 안에 있어야 함.
		 * 원래 코드에서는 이 실행문들이 Customer 클래스 바디에
		 * 직접 작성되어 있었기 때문에 컴파일 오류 발생.
		 * 프로그램 실행의 시작점인 main 메서드 안으로 이동해야 함.
		 */

		// 노트북 객체 생성 (n1은 원래 코드에서 정의 없이 사용되어 오류 발생했던 변수)
		Notebook n1 = new Notebook();

		// Customer 객체 생성
		Customer c1 = new Customer();
		c1.don = 10000000; // c1 인스턴스의 don 필드에 값 설정 (1000만원)
		c1.point = 100;    // c1 인스턴스의 point 필드에 값 설정

		System.out.println("=== Product 객체를 이용한 구매 ===");
		/*
		 * [오류 수정 설명 - Customer.buy() 호출 방식]
		 * 원래 코드: Customer.buy(n1.price, n1.point);  ← 잘못된 호출
		 * buy()는 static 메서드가 아닌 인스턴스 메서드.
		 * 인스턴스 메서드는 반드시 "객체.메서드명()" 형태로 호출해야 함.
		 * Customer.buy() 처럼 클래스명으로 호출하면 컴파일 오류 발생.
		 *
		 * 수정: Customer.buy(...) → c1.buy(...)
		 *
		 * [추가 설명 - n1을 Product 타입으로 전달 가능한 이유]
		 * Notebook은 Product를 상속(extends Product)하므로
		 * Notebook 객체(n1)를 Product 타입 매개변수에 전달 가능함.
		 * 이를 "업캐스팅(upcasting)" 이라고 함.
		 */
		c1.buy(n1); // c1이 n1(노트북)을 구매 → Product product 매개변수로 전달

		System.out.println();
		System.out.println("=== 가격/포인트 직접 전달 방식 구매 ===");

		// c1의 잔액을 리셋하고 int 방식으로 재구매 테스트
		c1.don = 10000000;
		c1.point = 100;
		c1.buy(n1.price, n1.point); // buy(int price, int point) 메서드 호출

		System.out.println();
		System.out.println("=== Keyboard 테스트 ===");
		Keyboard k1 = new Keyboard();
		System.out.println("Keyboard 객체 생성 완료: " + k1);

		/*
		 * [오류 수정 설명 - Customer.don = 10000]
		 * 원래 코드: Customer.don = 10000;  ← 잘못된 접근
		 * don은 static 필드가 아닌 인스턴스 필드.
		 * 인스턴스 필드는 클래스명이 아닌 "객체.필드명" 형태로 접근해야 함.
		 * 올바른 사용: c1.don = 10000;
		 *
		 * [오류 수정 설명 - Customer.buy()]
		 * 원래 코드: Customer.buy();  ← 잘못된 호출
		 * 1) buy()라는 인자 없는 메서드 자체가 없음
		 * 2) 설령 있더라도 static이 아니라 인스턴스 메서드이므로
		 *    클래스명으로 호출 불가
		 * 수정: 해당 코드 제거 (의미 없는 호출이었음)
		 */
	}

}
