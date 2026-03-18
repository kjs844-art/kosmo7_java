package start;

import com.winter.study.School;

/**
 * 프로젝트 전체의 실행을 담당하는 메인 시작 클래스입니다.
 */
public class Start {

    public static void main(String[] args) {
        System.out.println("=== 프로그램 시작 ===");
        
        // School 클래스의 인스턴스를 생성하고 start() 메서드를 호출하여
        // 학생 성적 관리 시스템을 실행합니다.
        School school = new School();
        school.start();
        
        System.out.println("=== 프로그램 종료 ===");
    }
}
