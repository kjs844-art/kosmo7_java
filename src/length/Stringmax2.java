package length;

import java.util.Scanner;

public class Stringmax2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 파일명을 입력받는다. 예: abc.png
        System.out.println("파일명을 입력하세요.");
        String fileName = sc.next();

        // 마지막 . 의 위치를 찾는다.
        // 파일명에서 확장자를 꺼내기 위해 사용한다.
        int idx = fileName.lastIndexOf(".");
        System.out.println(idx);

        // . 다음부터 끝까지 잘라서 확장자를 구한다.
        // abc.png -> png
        String ext = fileName.substring(idx + 1);
        System.out.println(ext);

        // 방법 1
        // equalsIgnoreCase()는 대소문자를 구분하지 않고 비교한다.
        // hello.PNG 처럼 대문자가 들어와도 비교할 수 있다.
        if (ext.equalsIgnoreCase("jpg")) {
            System.out.println("이미지 파일입니다.");
        } else if (ext.equalsIgnoreCase("png")) {
            System.out.println("이미지 파일입니다.");
        } else if (ext.equalsIgnoreCase("gif")) {
            System.out.println("이미지 파일입니다.");
        } else if (ext.equalsIgnoreCase("jpeg")) {
            System.out.println("이미지 파일입니다.");
        } else {
            // The old line had an extra "d" after println, which caused a compile error.
            System.out.println("이미지 파일이 아닙니다.");
        }

        // ----------------------------

        // 방법 2
        // 배열에 이미지 확장자 목록을 넣고 반복문으로 검사한다.
        String[] files = { "jpg", "gif", "png", "jpeg" };

        String result = "이미지 파일이 아닙니다.";

        for (int i = 0; i < files.length; i++) {
            if (ext.equalsIgnoreCase(files[i])) {
                result = "이미지 파일입니다.";
            }
        }

        System.out.println(result);

        sc.close();
    }
}
