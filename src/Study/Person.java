package Study;

/**
 * [수정 및 학습 포인트]
 * 1. 추상 클래스(Abstract Class): 'Person'은 직접 객체를 생성할 수 없는 추상적인 존재입니다.
 * 2. 필드 이동(상속의 기초): 'name'과 'age'는 모든 사람의 공통 속성이므로 부모 클래스로 옮겼습니다.
 * 3. 추상 메서드(activity): 자식 클래스들이 각자의 역할에 맞춰 반드시 구현해야 하는 동작입니다.
 */
public abstract class Person {
    public String name;
    public int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void activity();

    public void info() {
        System.out.println("--- 정보 출력 ---");
        System.out.println("이름: " + (name != null ? name : "미상"));
        System.out.println("나이: " + age);
    }
}
