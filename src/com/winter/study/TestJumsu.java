package com.winter.study;

import Study.Student; 

/**
 * [공부 기록] 성적 계산 및 참조 타입 연습 (TestJumsu + Testjumsu1 합본)
 */
public class TestJumsu {
    
    // 1. 점수 계산을 담당하는 메서드 (기록용)
    public void calculate(Student st) {
        if (st != null) {
            st.total = st.kor + st.eng + st.math;
            st.avg = st.total / 3.0;
        }
    }

    // 2. 참조 타입 연습용 메서드 (얕은 복사 vs 새로운 객체 생성의 차이)
    /*
     * [복습 포인트]
     * 매개변수로 넘어온 객체에 직접 값을 넣으면 원본이 바뀌지만,
     * 메서드 내부에서 'new'를 해버리면 새로운 주소를 가리키게 되어 원본과는 남남이 됩니다.
     */
    public void testReference(Student st) {
        // 이 코드는 원본을 바꾸지 못함 (새로운 객체를 생성했기 때문)
        st = new Student(); 
        st.total = 999; 
    }

    public static void main(String[] args) {
        TestJumsu testJumsu = new TestJumsu();
        Student student = new Student();
        
        student.name = "연습생";
        student.kor = 86;
        student.eng = 89;
        student.math = 70;
        
        // 계산 실행
        testJumsu.calculate(student);
        
        // 결과 출력
        System.out.println("=== " + student.name + " 학생의 성적 결과 ===");
        System.out.println("국어: " + student.kor);
        System.out.println("영어: " + student.eng);
        System.out.println("수학: " + student.math);
        System.out.println("-------------------");
        System.out.println("총점: " + student.total);
        System.out.println("평균: " + String.format("%.2f", student.avg));
    }
}
