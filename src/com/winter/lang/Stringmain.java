package com.winter.lang;

public class Stringmain {

    public static void main(String[] args) {
        String name = "winter";

        // 문자열 전체 출력
        System.out.println(name);

        // String의 charAt(index)는 문자열에서 글자 1개만 꺼낼 때 사용한다.
        // index는 0부터 시작한다.
        // "winter"의 index 번호
        // 0:w, 1:i, 2:n, 3:t, 4:e, 5:r

        // 0번 글자 꺼내기 -> w
        char first = name.charAt(0);
        System.out.println(first);

        // 1번 글자 꺼내기 -> i
        char iChar = name.charAt(1);
        System.out.println(iChar);

        // 4번 글자 꺼내기 -> e
        char eChar = name.charAt(4);
        System.out.println(eChar);

        // charAt()은 리턴 타입이 char이므로 변수도 char로 받는다.
        char ch = name.charAt(0);
        System.out.println(ch);

        // index 범위는 0부터 length() - 1 까지이다.
        // "winter"는 길이가 6이므로 사용 가능한 index는 0~5이다.
        // 만약 name.charAt(6)처럼 쓰면 범위를 벗어나서 오류가 난다.

        // Object 객체를 2개 생성한다.
        Object obj = new Object();
        Object obj2 = new Object();

        // toString()은 객체 정보를 문자열 형태로 바꾼다.
        String s1 = obj.toString();
        String s2 = obj.toString();

        // Object의 기본 equals()는 두 객체의 주소가 같은지 비교한다.
        // obj와 obj2는 서로 다른 객체이므로 결과는 false이다.
        boolean c = obj.equals(obj2);

        // 객체를 바로 출력하면 내부적으로 toString()이 호출된다.
        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(c);

        // 새 문자열 변수를 만든다.
        String name2 = "winter";

        // 문자열 비교는 == 대신 equals()를 사용한다.
        // equals()는 문자열의 내용이 같은지 비교한다.
        c = name.equals(name2); // name == name2;
        System.out.println(c);
    }
}
