package length;

// class는 관련 있는 코드들을 하나로 묶는 단위이다.
// 파일 이름과 public class 이름은 반드시 같아야 한다.
public class StringEx1Main {

    // main 메서드는 자바 프로그램이 처음 시작할 때 실행되는 특별한 메서드이다.
    // public: 어디서든 접근 가능
    // static: 객체를 만들지 않아도 실행 가능
    // void: return 값이 없음
    // String[] args: 실행할 때 전달되는 값들을 받는 배열
    public static void main(String[] args) {
        // String은 문자열 자료형이다.
        // "Hello World" 라는 문자열을 str 변수에 저장한다.
        String str = "Hello World";

        // length()는 문자열 길이를 구하는 메서드이다.
        // 공백도 글자 수에 포함된다.
        int l = str.length();
        System.out.println("문자열 길이: " + l);

        // for문은 반복문이다.
        // int i = 0;      : 반복에 사용할 변수 i를 0으로 시작
        // i < str.length(): i가 문자열 길이보다 작은 동안 반복
        // i++             : 한 번 반복할 때마다 1 증가
        for (int i = 0; i < str.length(); i++) {
            // charAt(i)는 i번째 글자 1개를 꺼내는 메서드이다.
            // char는 글자 1개를 저장하는 자료형이다.
            char ch = str.charAt(i);
            System.out.println(ch);
        }

        // valueOf()는 다른 자료형을 문자열로 바꿀 때 사용한다.
        String s = String.valueOf(false);
        System.out.println(s);
    }
}
