package com.winter.lang;

import java.util.Scanner;

// String 관련 메서드와 Object 비교를 연습하는 클래스
public class StringMain {

    public static void main(String[] args) {
        // Scanner:
        // 키보드 입력을 받을 때 사용하는 클래스
        Scanner sc = new Scanner(System.in);

        // String은 문자열 자료형
        String name = "winter";

        // charAt(3):
        // 0부터 시작하는 인덱스에서 3번째 위치의 문자 1개를 꺼낸다.
        char ch = name.charAt(3);
        System.out.println(ch);

        // Object:
        // 자바의 모든 클래스의 최상위 부모 클래스
        Object obj = new Object();

        // toString():
        // 객체를 문자열로 바꿔서 보여주는 메서드
        String s1 = obj.toString();
        String s2 = name.toString();

        System.out.println(obj);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(name);

        String s3 = sc.toString();
        System.out.println(s3);

        Object obj2 = new Object();

        // boolean:
        // 참(true) / 거짓(false)을 저장하는 자료형
        //
        // equals():
        // 내용이나 상태가 같은지 비교하는 메서드
        boolean c = obj.equals(obj2);
        System.out.println(c);

        String name2 = "winter";
        c = name.equals(name2);
        System.out.println(c);

        name2 = "Winter";
        c = name.equals(name2);
        System.out.println(c);

        // equalsIgnoreCase():
        // 대소문자를 무시하고 문자열을 비교
        c = name.equalsIgnoreCase(name2);
        System.out.println(c);
    }
}
