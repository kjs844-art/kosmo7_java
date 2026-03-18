package com.jiho.main;

import java.util.Scanner; 
// 1. 도구 가져오기

public class Tuto1 {
	public static void main(String[] args); {
		Scanner sc = new Scanner(System.in);
		//2. 입력 도구 생성
		
		
		int a = sc.nextInt(); // 3. 첫 번째 숫자 입력
		int b = sc.nextInt(); // 4. 두 번째 숫자 입력
		
		
		System.out.println(a  +  b); // 5. 합계 출력
		
		sc.close();  // 6. 도구 닫기
		

	}

}
