package RPG.charactor;

import com.winter.study.rpgmain.Staff;

/**
 * [수정 내용]
 * 1. 상속 적용: 부모 클래스 charactor를 상속받습니다.
 * 2. 추상 메서드 구현: 마법사만의 지팡이 마법 공격을 구현했습니다.
 * 3. 캡슐화 대응: Staff 객체가 있을 때와 없을 때의 공격 방식을 구분했습니다.
 */
public class Wizard extends charactor {

    public Wizard() {
        this.name = "이름없는 마법사";
        this.hp = 100;
        this.mp = 150;
        this.damage = 10;
        this.level = 1;
    }

    @Override
    public void attack() {
        if (this.staff != null) {
            System.out.println(name + "이(가) " + staff.name + "으로 마법 공격을 합니다!");
            System.out.println("데미지: " + (staff.power + damage));
        } else {
            System.out.println(name + "이(가) 미약한 마법 에너지를 방출합니다. (데미지: 5)");
        }
    }
}
