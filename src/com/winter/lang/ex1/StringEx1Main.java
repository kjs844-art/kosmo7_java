package com.winter.lang.ex1;

// package:
// 이 파일이 어떤 묶음(폴더 그룹)에 속하는지 알려주는 선언이다.
// package 이름과 폴더 구조가 맞아야 한다.

// public:
// 어디서든 접근할 수 있다는 뜻이다.
//
// class:
// 관련 있는 변수와 메서드를 하나로 묶는 설계도이다.
//
// StringEx1Main:
// 클래스 이름이다.
// 파일명도 반드시 StringEx1Main.java 여야 한다.
public class StringEx1Main {

    // public:
    // 어디서든 호출 가능
    //
    // static:
    // 객체를 만들지 않아도 바로 실행 가능
    //
    // void:
    // 이 메서드는 실행만 하고 return 값은 없다는 뜻
    //
    // main:
    // 자바 프로그램이 처음 시작할 때 실행되는 특별한 메서드 이름
    //
    // String[] args:
    // 실행할 때 전달되는 문자열들을 저장하는 배열
    public static void main(String[] args) {

        // String:
        // 문자열(글자 여러 개)을 저장하는 자료형
        //
        // str:
        // 변수 이름이다. 문자열을 저장하는 상자라고 생각하면 된다.
        //
        // = :
        // 오른쪽 값을 왼쪽 변수에 저장한다는 뜻
        //
        // ; :
        // 문장이 여기서 끝난다는 뜻
        String str = "Hello World";

        // int:
        // 정수(숫자)를 저장하는 자료형
        //
        // l:
        // length의 약자로 자주 쓰는 변수 이름
        //
        // str.length():
        // str 문자열의 길이를 구하는 메서드
        int l = str.length();
        System.out.println(l);

        // for:
        // 반복문
        //
        // int i = 0:
        // 반복에 사용할 변수 i를 만들고 0으로 시작
        //
        // i < str.length():
        // i가 문자열 길이보다 작은 동안 반복
        //
        // i++:
        // i를 1 증가시킨다는 뜻
        // i = i + 1 과 같은 의미
        for (int i = 0; i < str.length(); i++) {

            // char:
            // 글자 1개를 저장하는 자료형
            //
            // ch:
            // character의 약자로 많이 쓰는 변수 이름
            //
            // str.charAt(i):
            // i번째 글자 1개를 꺼내는 메서드
            char ch = str.charAt(i);
            System.out.println(ch);
        }

        // false:
        // boolean 자료형의 거짓 값
        //
        // String.valueOf(false):
        // false를 문자열 "false"로 바꾼다.
        String s = String.valueOf(false);
        System.out.println(s);
    }
}
