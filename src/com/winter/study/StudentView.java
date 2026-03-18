package com.winter.study;

import Study.Student;

public class StudentView {

    // 한 명의 학생 정보를 출력하는 메서드다.
    public void view(Student st) {
        if (st != null) {
            System.out.println("-------------------------");
            System.out.println("이름: " + st.name + " (" + st.age + "세)");
            System.out.println("국어: " + st.kor + " | 영어: " + st.eng + " | 수학: " + st.math);
            System.out.println("총점: " + st.total + " | 평균: " + String.format("%.2f", st.avg));
        }
    }

    // 배열을 돌면서 위의 view를 재사용하게 정리했다.
    public void viewList(Student[] students) {
        if (students != null) {
            System.out.println("\n======= 학생 성적 리스트 =======");
            for (Student st : students) {
                view(st);
            }
            System.out.println("===============================");
        }
    }
}
