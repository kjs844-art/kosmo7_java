package input;

import java.util.Scanner;

import Study.Student;

public class StudentInput {

    private final Scanner sc = new Scanner(System.in);

    // 학생 한 명을 입력받아 Student 객체를 완성한다.
    public Student makeStudent() {
        Student st = new Student();

        System.out.print("이름 입력: ");
        st.name = sc.next();

        System.out.print("나이 입력: ");
        st.age = sc.nextInt();

        System.out.print("국어 점수: ");
        st.kor = sc.nextInt();

        System.out.print("영어 점수: ");
        st.eng = sc.nextInt();

        System.out.print("수학 점수: ");
        st.math = sc.nextInt();

        st.calculate();
        return st;
    }

    public Student[] makeStudents() {
        System.out.print("공부할 학생이 몇 명인가요? ");
        int count = sc.nextInt();

        Student[] students = new Student[count];

        for (int i = 0; i < students.length; i++) {
            System.out.println("\n[" + (i + 1) + "번째 학생 정보 입력]");
            students[i] = makeStudent();
        }

        return students;
    }
}
