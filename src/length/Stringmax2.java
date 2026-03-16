package length;

import java.util.Scanner;

// 파일명에서 확장자를 꺼내고 이미지 파일인지 검사하는 예제
public class Stringmax2 {

    public static void main(String[] args) {
        // Scanner는 키보드 입력을 받을 때 사용하는 클래스이다.
        Scanner sc = new Scanner(System.in);

        System.out.println("파일명을 입력하세요.");

        // next()는 공백 전까지 한 단어를 입력받는다.
        String fileName = sc.next();

        // lastIndexOf(".")는 마지막 점(.)의 위치를 찾는다.
        // 예: abc.png 라면 . 위치를 숫자로 알려준다.
        int idx = fileName.lastIndexOf(".");
        System.out.println(idx);

        // substring(idx + 1)은 점 다음부터 끝까지 잘라낸다.
        // 즉 확장자만 꺼내는 코드이다.
        // abc.png -> png
        String ext = fileName.substring(idx + 1);
        System.out.println(ext);

        // 방법 1: if / else if 로 직접 비교
        // equalsIgnoreCase()는 대소문자를 구분하지 않고 비교한다.
        // PNG, png, Png 모두 같은 것으로 본다.
        if (ext.equalsIgnoreCase("jpg")) {
            System.out.println("이미지 파일입니다.");
        } else if (ext.equalsIgnoreCase("png")) {
            System.out.println("이미지 파일입니다.");
        } else if (ext.equalsIgnoreCase("gif")) {
            System.out.println("이미지 파일입니다.");
        } else if (ext.equalsIgnoreCase("jpeg")) {
            System.out.println("이미지 파일입니다.");
        } else {
            System.out.println("이미지 파일이 아닙니다.");
        }

        // ------------------------------

        // 방법 2: 배열에 허용할 확장자를 넣고 반복문으로 검사
        String[] files = { "jpg", "gif", "png", "jpeg" };

        String result = "이미지 파일이 아닙니다.";

        for (int i = 0; i < files.length; i++) {
            if (ext.equalsIgnoreCase(files[i])) {
                result = "이미지 파일입니다.";
                break;
            }
        }

        System.out.println(result);

        // 사용이 끝난 Scanner는 닫아주는 습관을 들이는 것이 좋다.
        sc.close();
    }
}
