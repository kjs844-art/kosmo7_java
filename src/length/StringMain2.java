package length;

// 문자열 메서드들을 연습하는 클래스
public class StringMain2 {

    public static void main(String[] args) {
        // 문자열 준비
        String str = "Hello World";

        // charAt(0)은 0번째 글자 1개를 꺼낸다.
        // 인덱스는 0부터 시작한다.
        char ch = str.charAt(0);
        System.out.println(ch);

        // indexOf("l")은 처음 만나는 l의 위치를 찾는다.
        // "Hello World"에서는 첫 l의 위치가 2이다.
        int idx = str.indexOf("l");
        System.out.println(idx);

        // lastIndexOf("l")은 마지막 l의 위치를 찾는다.
        idx = str.lastIndexOf("l");
        System.out.println(idx);

        // l이 총 몇 개인지 구해보자.
        // count는 개수를 세는 변수
        int count = 0;

        // index는 찾은 위치를 저장하는 변수
        // 처음에는 아무 위치도 찾지 않았으므로 -1로 시작
        int index = -1;

        // while문은 조건이 true인 동안 계속 반복된다.
        while (true) {
            // indexOf("l", index + 1)은
            // index + 1 위치부터 다시 l을 찾으라는 뜻이다.
            index = str.indexOf("l", index + 1);

            // 찾았으면 위치가 0 이상이고,
            // 못 찾았으면 -1이 나온다.
            if (index != -1) {
                count++;
            } else {
                // 더 이상 찾을 l이 없으면 반복 종료
                break;
            }
        }

        System.out.println(count);

        // split() 예제
        // 쉼표로 연결된 문자열을 배열로 나눈다.
        String st = "한화, 기아 , 삼성, 롯데, 키움, SSG, 두산, LG, NC, KT";

        // String[] 는 문자열 배열 뜻이다.
        // split(",")은 , 기준으로 문자열을 잘라 배열로 만든다.
        String[] teams = st.split(",");

        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i]);
        }

        // trim()은 앞뒤 공백 제거
        // teams[1]은 " 기아 "처럼 공백이 포함될 수 있으므로 trim()을 사용한다.
        System.out.println(teams[1].trim().equals("기아"));
    }
}
