package com.winter.util;

import java.util.ArrayList;
import java.util.HashSet;

public class ListMain2 {

	public static void main(String[] args) {
		// Set은 중복을 허용하지 않는 자료구조다.
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(2);

		// 중복된 2는 한 번만 저장되므로 크기를 확인해 본다.
		System.out.println(set.size());

		// generic을 사용하면 Integer 타입만 저장할 수 있다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(10);

		// 제네릭이 Integer라서 꺼낼 때도 int로 바로 받을 수 있다.
		int n = list.get(0);
		int n2 = list.get(1);

		System.out.println("첫 번째 값 : " + n);
		System.out.println("두 번째 값 : " + n2);
	}
}
