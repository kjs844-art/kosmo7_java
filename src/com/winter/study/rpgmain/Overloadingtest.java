package com.winter.study.rpgmain;

public class Overloadingtest {
	
	// 첫 번째 hap 메서드: (float, int) 순서의 매개변수
	public void hap(float a, int b) {
		System.out.println(a + b);
	} // <- 첫 번째 메서드의 닫는 중괄호가 여기 있어야 합니다.

	/*
	 * [오류 원인 해설]
	 * 원래 코드는 아래 hap 메서드가 위 hap 메서드 '내부'에 들어가 있었습니다.
	 * 자바에서는 메서드 안에 메서드를 선언할 수 없습니다(중첩 메서드 불가).
	 * 또한 메서드 선언 뒤에 중괄호 { } 가 누락되어 있었습니다.
	 */
	
	// 두 번째 hap 메서드: (int, float) 순서의 매개변수 (오버로딩)
	public void hap(int a, float b) {
		System.out.println(a + b);
	}
}
