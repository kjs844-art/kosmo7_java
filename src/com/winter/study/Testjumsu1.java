package com.winter.study;

import Study.Student;

public class Testjumsu1 {
    
    // 1번 연습용 메서드 (총점, 평균 계산)
    public void t1(Student st) {
        if (st != null) {
            st.total = st.kor + st.eng + st.math;
            st.avg = st.total / 3.0;
        }
    }

    // 2번 연습용 메서드 (참조 타입의 이해 - 얕은 복사 vs 새로운 객체 생성)
    public void t2(Student st) {
        // 주의: 여기서 new를 하면 매개변수 st가 새로운 객체를 가리키게 되어, 
        // 외부에서 호출 시 넘겨준 원본 객체에는 변화가 생기지 않습니다!
        st = new Student(); 
        st.total = 90;
        st.avg = 30.0;
    }
    
    public static void main(String[] args) {
        // 테스트용 코드 추가 가능
    	
    	//TestJumsu tj : new TestJumsu():
    	//StudentView sv = new StudentInput():
    	
        System.out.println("Testjumsu1 실행 테스트용 클래스입니다.");
    }
}
