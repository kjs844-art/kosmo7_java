package com.winter.lang;

// indexOf, lastIndexOf, split, trim, while 문을 연습하는 클래스
public class StringMain2 {

    public static void main(String[] args) {
        String str = "Hello World";
        char ch = str.charAt(0);
        System.out.println(ch);

        // idx:
        // index의 줄임말로 자주 쓰는 변수 이름
        // 위치 번호를 저장할 때 많이 사용한다.
        int idx = str.indexOf("l");
        System.out.println(idx);

        idx = str.lastIndexOf("z");
        System.out.println(idx);

        // count:
        // 개수를 세는 변수 이름으로 자주 사용
        int count = 0;

        // flag:
        // 현재 상태를 저장하는 boolean 변수 이름으로 자주 사용
        // true면 계속 진행, false면 멈춤 같은 의미로 많이 쓴다.
        boolean flag = true;

        int index = -1;

        // while:
        // 조건이 true인 동안 계속 반복
        while (flag) {
            index = str.indexOf("l", index + 1);

            // if:
            // 조건이 맞으면 실행
            if (index != -1) {
                // count++:
                // count를 1 증가
                // count = count + 1 과 같은 뜻
                count++;
            } else {
                // false:
                // 거짓
                // flag를 false로 바꾸면 while(flag)는 더 이상 반복되지 않는다.
                flag = false;

                // break;
                // 현재 반복문을 즉시 끝낸다.
                break;
            }
        }

        System.out.println(count);

        String st = "한화, 기아 , 삼성, 롯데, 키움, ssg, 두산, lg, nc, kt";

        // String[]:
        // 문자열 배열
        // 문자열 여러 개를 순서대로 저장할 수 있다.
        String[] teams = st.split(",");

        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i]);
        }

        // trim():
        // 앞뒤 공백 제거
        System.out.println(teams[1].trim().equals("기아"));
    }
}
