package Study;

import com.winter.study.Salary;

class TeacherInfo extends Person {
    public String subject;
    public Salary salary;
    public Student st;

    public TeacherInfo(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void activity() {
        System.out.println((name != null ? name : "미상") + " 선생님은 " + subject + " 과목을 강의 중입니다.");
    }

    public void showSalaryInfo(int amount, boolean isTaxed) {
        if (salary != null) {
            salary.make(amount, isTaxed);
        }
    }
}

public class Teacher {
    public static void main(String[] args) {
        Student s = new Student("장보고", 17);
        s.kor = 80;
        s.eng = 90;
        s.math = 85;
        s.calculate();

        TeacherInfo t = new TeacherInfo("이순신", 45, "전략");
        t.st = s;
        t.salary = new Salary();

        t.info();
        t.activity();
        t.showSalaryInfo(700, true);

        System.out.println("관리 중인 학생 정보:");
        t.st.info();
    }
}
