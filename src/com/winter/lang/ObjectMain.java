package com.winter.lang;

public class ObjectMain extends Object {

	public static void main(String[] args) {
		// 자바의 모든 클래스의 최상위 부모는 Object이다.
		// 그래서 String 객체도 Object 타입 변수에 담을 수 있다.
		String name = "winter";

		// 업캐스팅 예제
		Object obj = name;

		// 이 파일은 Object 타입으로 받을 수 있다는 개념 설명용 예제이다.
	}

}
