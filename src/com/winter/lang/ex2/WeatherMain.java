package com.winter.lang.ex2;

public class WeatherMain {

	public static void main(String[] args) {
		// WeatherMaker 생성
		WeatherMaker wm = new WeatherMaker();

		// 도시 정보가 들어 있는 DTO 배열 받기
		WeatherDTO[] ar = wm.init();

		// 선생님 코드 기준으로 여기서는 배열만 받아오고 끝난다.
	}

}
