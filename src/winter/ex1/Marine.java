package winter.ex1;

import java.util.Scanner;

public class Marine {
    // 1. 마린의 속성(필드) 정의
    public int hp;
    public int damage;
    public int defence;
    public int range;

    // 2. 동작(메소드) 정의
    public void attack() {
        System.out.println("마린이 공격을 시작합니다! (공격력: " + damage + ")");
    }

    public void move() {
        System.out.println("마린이 이동합니다.");
    }

    // 3. 메인 메소드 (프로그램 시작점)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Marine soldier = new Marine(); // 변수 이름을 soldier로 통일
        soldier.hp = 50;
        soldier.defence = 20;
        soldier.damage = 5;
        soldier.range = 4;
        
        System.out.println("마린 체력: " + soldier.hp);
        System.out.println("--- 명령을 선택하세요 ---");
        System.out.println("1. 공격 | 2. 이동");
        
        int select = sc.nextInt();
        
        if(select == 1) {
            soldier.attack();
        } else {
            soldier.move();
        }
        
        System.out.println("\n--- 마린 주소 정보 ---");
        System.out.println("객체 주소: " + soldier);
    }
}
