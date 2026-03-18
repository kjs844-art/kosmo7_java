package com.winter.study.rpgmain;

public class Monster {
	
	// 몬스터 속성 (public으로 설정하여 외부 접근 허용)
	public String name;
	public int hp;
	public int level;
	public int damage;
	public int gold = 20;
	
	/**
	 * 참조 타입 필드: 몬스터가 장착할 수 있는 지팡이(무기) 객체
	 */
	public Staff staff;

	// 생성자: 기본값 초기화로 NullPointerException 방지
	public Monster() {
		this.name = "이름없는 몬스터";
		this.hp = 50;
		this.level = 1;
		this.damage = 10;
	}

	public void attack() {
		if (this.staff != null) {
			System.out.println("몬스터 " + name + "(이)가 " + staff.name + "(으)로 강력하게 공격합니다!");
			int totalDamage = this.damage + staff.power;
			System.out.println("합산 데미지: " + totalDamage + " (기본 " + this.damage + " + 무기 " + staff.power + ")");
		} else {
			System.out.println("몬스터 " + name + "(이)가 맨손으로 공격합니다!");
			System.out.println("데미지: " + damage);
		}
	}

	public int check() {
		if (this.hp < 1) {
			System.out.println("꾸에엑... " + name + "이(가) 사망했습니다.");
			return gold;
		}
		return 0;
	}
}
