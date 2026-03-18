package Daiso;

public class Customer {

	int don;
	int point;


	/*
	 * [오류1 - 매개변수 타입 오류]
	 * 원래 코드: public void buy(Product[] product)
	 * Product[] 는 "Product 배열" 을 의미함.
	 * 배열에는 .price, .point 같은 필드가 없으므로
	 * product.price → 컴파일 오류 ("cannot be resolved or is not a field")
	 *
	 * [수정 방법]
	 * Product[] (배열) → Product (단일 객체) 로 변경.
	 * 단일 Product 객체 참조로 받으면 product.price, product.point 접근 가능.
	 * (만약 여러 제품을 한 번에 처리하고 싶다면 for 루프를 써야 하지만,
	 *  이 수업 예제는 제품 1개를 구매하는 것이므로 단일 객체가 맞음)
	 *
	 * [오류2 - 메서드 닫는 중괄호 누락]
	 * 원래 코드에서 이 메서드의 닫는 } 가 없었음.
	 * 그 결과 아래의 buy(int price, int point) 메서드가
	 * 이 메서드 "안에" 중첩 선언되는 형태가 되어버려 컴파일 오류 발생.
	 * Java에서는 메서드 안에 또 다른 메서드를 선언할 수 없음.
	 *
	 * [수정 방법]
	 * System.out.println 출력 후 } 를 추가하여 메서드를 올바르게 닫음.
	 */
	public void buy(Product product) { // Product[] 배열 → 단일 Product 객체로 수정
		// 자기가 가진 돈에서 제품의 가격을 뺀다.
		this.don = this.don - product.price;
		// 자기가 가진 포인트에서 제품의 포인트를 더한다.
		this.point = this.point + product.point;
		System.out.println("구매를 완료했습니다.");
		System.out.println("잔액: " + this.don);
		System.out.println("포인트: " + this.point);
	} // [수정] 닫는 중괄호 추가 - 원래 코드에는 이 } 가 없어서 아래 코드가 모두 이 안으로 들어가버렸음


	/*
	 * [오류3 - 메서드 본문 누락]
	 * 원래 buy(int price, int point) 메서드 안이 비어있었음.
	 * 실제 로직인 this.don 계산, 출력 코드들이 메서드 바깥(클래스 바디)에 작성되어 있었음.
	 * Java에서 실행문(계산, 출력 등)은 반드시 메서드 안에 있어야 함.
	 * 클래스 바디에 직접 실행문을 쓰면 컴파일 오류 발생.
	 *
	 * [수정 방법]
	 * 클래스 바디에 흩어져 있던 실행문들(this.don - price, System.out.println 등)을
	 * 이 메서드 안으로 옮김.
	 */
	public void buy(int price, int point) {
		// 자기가 가진 돈에서 제품의 가격을 뺀다.
		this.don = this.don - price;
		// 자기가 가진 포인트에서 제품의 포인트를 더한다.
		this.point = this.point + point;
		// 구매 후 잔액과 포인트를 출력한다.
		System.out.println("잔액: " + this.don);
		System.out.println("포인트: " + this.point);
	}

	/*
	 * [오류4 - 클래스 바디에 실행문 작성 (원래 코드 lines 24~39)]
	 * 원래 코드에는 아래와 같은 코드들이 클래스 안, 메서드 밖에 작성되어 있었음:
	 *
	 *   Customer c1 = new Customer();
	 *   c1.don = 10000000;
	 *   Customer.buy(n1.price, n1.point);   ← 오류5: n1 미정의 + static 아닌 메서드 호출
	 *   Customer.don = 10000;               ← 오류6: 인스턴스 필드를 클래스명으로 접근
	 *   this.don = this.don - price;        ← 오류7: 메서드 밖에 this 사용
	 *   Customer.buy();                     ← 오류8: 인자 없는 buy() 메서드 없음
	 *
	 * [오류5 설명] Customer.buy(...) → buy()는 static 메서드가 아님.
	 *   인스턴스 메서드는 반드시 "객체.메서드명()" 형태로 호출해야 함.
	 *   또한 n1이 어디에도 선언되지 않아 "n1 cannot be resolved" 오류 발생.
	 *
	 * [오류6 설명] Customer.don = 10000 → don은 static 필드가 아님.
	 *   인스턴스 필드는 클래스명이 아닌 "객체.필드명" 형태로 접근해야 함.
	 *   (예: c1.don = 10000)
	 *
	 * [오류7 설명] this는 메서드나 생성자 안에서만 사용 가능.
	 *   클래스 바디(필드 선언부)에서는 this를 쓸 수 없음.
	 *
	 * [오류8 설명] buy()라는 인자 없는 메서드가 존재하지 않아 컴파일 오류.
	 *
	 * [수정 방법]
	 * 이 실행문들은 모두 Daisomain.java 의 main 메서드로 이동함.
	 * main 메서드 안에서 객체를 생성하고 올바른 방식(c1.buy(...))으로 호출해야 함.
	 */

}
