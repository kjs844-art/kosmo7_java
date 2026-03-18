package RPG.charactor;

import com.winter.study.rpgmain.Staff;

/**
 * [수정 내용]
 * 1. 추상화 적용: 모든 RPG 캐릭터의 공통 속성을 정의하는 추상 클래스로 전환했습니다.
 * 2. 추상 메서드 정의: 공격 방식(attack)을 자식들이 각자 정의하도록 했습니다.
 */
public abstract class charactor {
	public String name;
	public int hp;
	public int mp;
	public int damage;
	public int level;
	public int gold;
	
	public Staff staff;

	public void info() {
		System.out.println("--- 캐릭터 정보 ---");
		System.out.println("이름 : " + name);
        System.out.println("체력 : " + hp + " / 마나 : " + mp);
        System.out.println("레벨 : " + level + " / 골드 : " + gold);
	}

    public abstract void attack();
}