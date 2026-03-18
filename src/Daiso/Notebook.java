package Daiso;

public class Notebook extends Product {

	/*
	 * [오류1 - private 필드 중복 선언]
	 * 원래 코드:
	 *   private String name;
	 *   private int point;
	 *   private int price;
	 *
	 * Notebook은 Product를 상속(extends)하므로 Product의 price, point, name 필드를
	 * 이미 물려받음(상속).
	 * 그런데 여기서 똑같은 이름으로 private 필드를 "다시" 선언하면,
	 * Product에서 물려받은 필드를 "가리는(hiding)" 현상이 발생함.
	 * 그 결과 Customer.buy(Product product) 에서 product.price 를 접근하면
	 * Product의 price 필드를 보게 되지만, 정작 값이 설정된 건 private인
	 * Notebook.price 였으므로 항상 0이 출력되는 논리 오류가 생김.
	 * 또한 private 이라서 Customer 같은 외부 클래스에서 접근 자체가 막힘.
	 *
	 * [수정 방법]
	 * private 필드 선언 3개를 모두 제거.
	 * price, point, name 은 Product(부모)에서 이미 정의되어 있으므로
	 * 생성자에서 this.price = ... 형태로 상속받은 필드에 값을 설정하면 됨.
	 */
	String cpu; // cpu는 Notebook에만 있는 고유 필드이므로 여기에 선언

	/*
	 * [오류2 - 생성자 닫는 중괄호 누락]
	 * 원래 코드에서 public Notebook() 생성자의 닫는 } 가 없었음.
	 * 클래스 전체를 닫는 } 가 생성자의 } 역할을 했고,
	 * 이로 인해 클래스가 제대로 닫히지 않아 컴파일 오류 발생.
	 *
	 * [수정 방법]
	 * 생성자 본문 끝에 } 를 추가하고, 클래스를 닫는 } 도 별도로 유지.
	 */
	public Notebook() {
		// Product에서 상속받은 필드에 값을 설정
		this.price = 1000000; // 노트북 가격 100만원
		this.point = 10000;   // 구매 시 적립 포인트 10,000점
		this.name = "노트북";
		this.cpu = "인텔 i7";
	} // [수정] 생성자 닫는 중괄호 추가 - 원래 이 } 가 없었음

}
