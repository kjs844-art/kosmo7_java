package length;

public class StringEx1Main {

    public static void main(String[] args) {
        String str = "Hello World";

        // 문자열의 길이를 구한다.
        // 공백도 글자 수에 포함된다.
        int l = str.length();
        System.out.println("문자열 길이: " + l);

        // 문자열의 인덱스는 0부터 시작한다.
        // i를 0부터 length() - 1까지 반복하면서
        // charAt(i)로 문자열의 글자를 한 글자씩 꺼낸다.
        // 아래처럼 for문에서 처음 i를 만드는 것은 정상이다.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }

        // 주의:
        // int i = 0;
        // for (int i = 0; i < str.length(); i++) {}
        // 위처럼 같은 메서드 안에서 i를 두 번 선언하면 오류가 난다.
        // 이미 i를 만들었다면 for (i = 0; i < str.length(); i++) 처럼 써야 한다.
    }
}
