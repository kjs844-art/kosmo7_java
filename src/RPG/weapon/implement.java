package RPG.weapon;

public class implement extends Weapon {

    public implement() {
        this.name = "기본 무기";
        this.damage = 10;
        this.levelRequirement = 1;
    }

    @Override
    public void use() {
        System.out.println(name + "을(를) 사용합니다.");
    }
}
