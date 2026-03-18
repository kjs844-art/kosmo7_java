package Member;

public class Member {

    String name;
    String id;
    String password;
    int age;
    String address;

    public Member() {
        this("이름없음", 0, "주소 미정");
    }

    public Member(String name) {
        this(name, 0, "주소 미정");
    }

    public Member(int age) {
        this("이름없음", age, "주소 미정");
    }

    public Member(String name, int age) {
        this(name, age, "주소 미정");
    }

    // Membermain에서 생성자 오버로딩을 연습하고 있어서 모든 경우를 받게 맞췄다.
    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = "";
        this.password = "";
    }

    public void info() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);
    }
}
