package Member;

public class Membermain {

    public static void main(String[] args) {
        Member m1 = new Member();
        m1.info();

        System.out.println("===================================");

        Member m2 = new Member("홍길동", 30, "서울시 강남구");
        m2.info();

        System.out.println("===================================");

        Member m3 = new Member("김철수", 25);
        m3.info();

        System.out.println("===================================");

        Member m4 = new Member("이영희");
        m4.info();

        System.out.println("===================================");

        Member m5 = new Member(40);
        m5.info();

        System.out.println("===================================");

        Member m6 = new Member("부산시 해운대구");
        m6.info();
    }
}
