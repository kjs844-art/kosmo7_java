package RPG.charactor;

import com.winter.study.rpgmain.Monster;

/**
 * [수정 내용]
 * 1. 상속 적용: 추상 클래스 charactor를 상속받습니다.
 * 2. 추상 메서드 전용: 전사만의 칼 휘두르기 공격을 구현했습니다.
 */
public class Warrior extends charactor {

    public Warrior() {
        this.name = "이름없는 전사";
        this.hp = 200;
        this.damage = 20;
    }

	@Override
	public void attack() {
		System.out.println(name + "이(가) 검으로 공격하며 묵직한 데미지를 입힙니다!");
	}

	public void attackAll(Monster[] monsters) {
		System.out.println("=== 전사 " + name + "의 광역 베기!!! ===");
		if (monsters != null) {
			for (Monster m : monsters) {
				if (m != null) {
					System.out.println(m.name + "에게 15의 데미지!");
					m.hp -= 15;
				}
			}
		}
	}
}
