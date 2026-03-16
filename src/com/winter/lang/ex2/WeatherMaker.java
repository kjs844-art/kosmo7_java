package com.winter.lang.ex2;

public class WeatherMaker {

	private String info;

	public WeatherMaker() {
		// - 로 연결된 도시 이름 문자열
		this.info = "서울-대전- 대구-부산-인천-제주";
	}

	public WeatherDTO[] init() {
		// - 를 기준으로 잘라 문자열 배열 생성
		String[] ar = this.info.split("-");

		// DTO 배열 생성
		WeatherDTO[] weathers = new WeatherDTO[6];

		for (int i = 0; i < ar.length; i++) {
			weathers[i] = new WeatherDTO();
			weathers[i].setCityName(ar[i]);
		}

		return weathers;
	}

}
