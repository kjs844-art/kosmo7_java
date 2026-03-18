package Study;

public class Student extends Person {

    public int kor;
    public int eng;
    public int math;
    public int total;
    public double avg;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void activity() {
        System.out.println(name + " 학생은 학교에서 공부합니다.");
    }

    // 점수 계산 로직은 여러 클래스에서 재사용하므로 Student 안에 고정했다.
    public void calculate() {
        this.total = kor + eng + math;
        this.avg = total / 3.0;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("총점: " + total);
        System.out.println("평균: " + String.format("%.2f", avg));
    }

    public void introduce() {
        System.out.println("안녕하세요, 제 이름은 " + (name != null ? name : "미상") + "이고, 나이는 " + age + "살입니다.");
    }

    public void print() {
        System.out.println("국어: " + kor + ", 영어: " + eng + ", 수학: " + math);
    }
}
