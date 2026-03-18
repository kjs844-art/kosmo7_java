package com.winter.study.rpgmain;

import RPG.charactor.Warrior;

public class RpgMain {

	public static void main(String[] args) {
		// 1. 전사와 몬스터 객체 생성
		Warrior w = new Warrior();
		w.name = "아라곤";
		w.hp = 200;

		Monster m = new Monster();
		m.name = "슬라임";
		m.hp = 100;

		Monster m2 = new Monster();
		m2.name = "고블린";
		m2.hp = 50;

		Monster m3 = new Monster();
		m3.name = "오크";
		m3.hp = 150;
		
		// 2. 몬스터들을 배열에 담기
		Monster[] monsters = {m, m2, m3};

		/*
		 * [오류 원인 해설]
		 * 원래 코드: w.attackAll();
		 * 원인: Warrior 클래스의 attackAll 메서드는 Monster[] 배열을 인자로 받도록 되어 있습니다.
		 * 따라서 담아놓은 monsters 배열을 넣어주어야 합니다.
		 */
		w.attackAll(monsters); 
	}
}
