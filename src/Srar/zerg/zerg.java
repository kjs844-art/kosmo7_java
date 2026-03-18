package Srar.zerg;

public class zerg {
	
	/*
	 * [오류 원인 해설]
	 * 1. public class 안에 또 다른 public class를 만들고, 
	 * 2. attack() 메서드 중괄호를 안 닫은 상태에서 main을 정의하는 등 구조가 깨져 있었습니다.
	 * -> zerg 클래스 하나로 통합하고 괄호를 제대로 맞췄습니다.
	 */

	int hp;
	int damage;
	
	public void attack() {
		System.out.println("저그 유닛이 공격합니다!");
	}
		
	public static void main(String[] args) {
		zerg z1 = new zerg();
		z1.hp = 40;
		z1.damage = 5;
		
		System.out.println("--- 저그 유닛 생성 ---");
		z1.attack();
	}
}
