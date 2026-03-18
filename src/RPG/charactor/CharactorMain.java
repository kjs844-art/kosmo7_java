package RPG.charactor;

/**
 * [수정 내용]
 * 1. 다형성 구현: 부모 클래스(charactor) 타입의 변수(c1, c2)로 자식 객체(Wizard, Warrior)를 관리합니다.
 * 2. 동적 바인딩: c1.attack() 호출 시 실제 객체인 Wizard의 attack()이 실행됩니다.
 * 3. 형변환 연습: instanceof를 사용하여 안전하게 강제 형변환(Downcasting)을 수행합니다.
 */
public class CharactorMain {
	
	public static void main(String[] args) {
	     Wizard w1 = new Wizard();
	     w1.name = "메르세데스";
         w1.hp = 100;
	     
	     Warrior wa1 = new Warrior();
         wa1.name = "카이저";
         wa1.hp = 200;
	     
	     // 다형성 (부모 타입으로 자식 객체 참조)
	     charactor c1 = w1;		
	     charactor c2 = wa1;
	     
         System.out.println("--- 다형성을 이용한 정보 출력 ---");
         c1.info();
         c1.attack();
         
         c2.info();
         c2.attack();
         
         // 강제 형변환 (Downcasting)
         if (c1 instanceof Wizard) {
             Wizard w2 = (Wizard) c1;
             System.out.println("형변환 성공: " + w2.name + "은(는) 마법사입니다.");
         }
	}
}
