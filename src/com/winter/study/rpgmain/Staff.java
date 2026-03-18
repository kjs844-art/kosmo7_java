package com.winter.study.rpgmain;

/**
 * 마법사가 사용하는 지팡이 정보를 담는 클래스입니다.
 */
public class Staff {
	
	/*
	 * [오류 원인 해설]
	 * 원래 코드에서는 String name, int damage 등이 중복으로 선언되어 있었습니다.
	 * 같은 이름의 변수를 클래스 안에 두 번 선언하면 충돌(Duplicate field)이 발생합니다.
	 * 또한 외부에서 접근할 수 있도록 모두 'public'으로 통일했습니다.
	 */

    // 지팡이 이름
    public String name;
    // 기본 공격력
    public int damage;
    // 마법 공격력 (추가 공격력)
    public int power;
    // 캐릭터 사용 가능 레벨 제한
    public int levelRequirement;

    /**
     * 정보를 출력하는 메서드
     */
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Staff{name='" + name + "', damage=" + damage + ", power=" + power + "}";
    }
}