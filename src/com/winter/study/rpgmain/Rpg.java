package com.winter.study.rpgmain;

import RPG.charactor.Wizard;

/**
 * RPG 게임의 시작점(EntryPoint)을 담당하는 클래스입니다.
 */
public class Rpg {

    public static void main(String[] args) {
        // 1. 마법사(Wizard) 객체 생성
        Wizard wizard = new Wizard();
        wizard.name = "간달프";
        wizard.hp = 100;
        
        // 2. 지팡이(Staff) 객체 생성
        Staff staff = new Staff();
        
        /* 
         * [오류 원인 해설]
         * 원래 코드: this.damage = 10;
         * 원인: main 메서드는 'static' 지역입니다. static 안에서는 'this'를 사용할 수 없습니다.
         * 또한 damage는 staff 객체의 속성이므로 staff.damage로 접근해야 합니다.
         */
        staff.damage = 10; 
        staff.name = "나무 지팡이";
        staff.power = 15;
        
        // 3. 마법사에게 지팡이 장착
        wizard.staff = staff;
        
        // 4. 정보 출력
        System.out.println("--- RPG 캐릭터 정보 ---");
        System.out.println("이름: " + wizard.name);
        System.out.println("체력: " + wizard.hp);
        
        if(wizard.staff != null) {
            System.out.println("장착 무기: " + wizard.staff.name + " (공격력: " + wizard.staff.power + ")");
        }
        
        // 5. 동작 수행
        System.out.println("\n--- 전투 상황 ---");
        wizard.attack();
    }
}
