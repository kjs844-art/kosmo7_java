package com.winter.study;

import Study.Student;
import input.StudentInput;

public class School {
    
    public void start() {
        StudentInput si = new StudentInput();
        StudentView sv = new StudentView();
        
        // 1. 데이터 입력 (배열 사용)
        Student[] students = si.makeStudents();
        
        // 2. 전체 데이터 출력
        sv.viewList(students);
    }
    
    public static void main(String[] args) {
        School school = new School();
        school.start();
    }
}
