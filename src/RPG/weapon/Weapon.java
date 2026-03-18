package RPG.weapon;

public abstract class Weapon {
    public String name;
    public int damage;
    public int levelRequirement;

    public void info() {
        System.out.println("무기 이름: " + name + " / 공격력: " + damage);
    }

    // 무기마다 사용하는 방식이 다를 수 있어서 추상 메서드로 남겼다.
    public abstract void use();
}
