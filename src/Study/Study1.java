package Study;

public class Study1 {
    public static void main(String[] args) {
        Student myStudent = new Student();

        myStudent.name = "홍길동";
        myStudent.age = 25;
        myStudent.kor = 90;
        myStudent.eng = 85;
        myStudent.math = 95;
        myStudent.calculate();

        System.out.println("--- 학생 정보 및 행동 ---");
        myStudent.info();
        myStudent.activity();
        myStudent.print();

        System.out.println("\n--- 인사하기 ---");
        myStudent.introduce();
    }
}
