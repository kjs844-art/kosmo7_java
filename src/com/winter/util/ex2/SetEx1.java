package com.winter.util.ex2;

import java.util.HashSet;
import java.util.Random;

public class SetEx1 {

	public static void main(String[] args) {
		// 랜덤 숫자를 만들기 위한 객체 생성
		Random random = new Random();
		// 중복 없는 숫자를 담기 위한 Set 생성
		HashSet<Integer> set = new HashSet<Integer>();

		// 로또 번호 6개가 모일 때까지 반복
		while (set.size() != 6) {
			// 1~45 사이의 숫자 하나 뽑기
			int n = random.nextInt(45) + 1;
			// Set은 중복을 자동으로 막아 주므로 그대로 add 하면 된다.
			set.add(n);
		}

		// 최종 로또 번호 출력
		System.out.println(set);
	}
}
