package Member;

public class Newmember {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Newmember(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // 기존 코드는 member.member 같은 잘못된 참조가 있었어서 새 Member 객체만 반환하게 정리했다.
    public static Member getInstance() {
        return new Member();
    }

    public void printProfile() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("몸무게: " + weight);
        System.out.println("키: " + height);
    }
}
