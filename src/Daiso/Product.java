package Daiso;

public class Product {

	/*
	 * [오류 원인]
	 * 원래 Product 클래스에 필드(price, point, name)가 전혀 없었음.
	 * Customer의 buy(Product product) 메서드에서 product.price, product.point 를
	 * 접근하려 했지만, Product에 해당 필드가 없으니 "cannot be resolved or is not a field"
	 * 컴파일 오류가 발생함.
	 *
	 * [수정 방법]
	 * Product 클래스에 price, point, name 필드를 직접 정의.
	 * Notebook, Keyboard 등 Product를 상속(extends)하는 자식 클래스들이
	 * 이 필드들을 물려받아 생성자에서 값을 설정할 수 있게 됨.
	 * 접근제한자를 package-private(아무것도 안 붙임)으로 두어
	 * 같은 패키지(Daiso) 안에서 자유롭게 접근 가능하게 함.
	 */

	int price;   // 제품 가격
	int point;   // 제품 구매 시 적립 포인트
	String name; // 제품 이름

}
