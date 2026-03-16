package com.winter.lang.ex2;

public class WeatherDTO {

	// 도시 이름 저장용 변수
	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		// 선생님 코드처럼 toString 내부에서 출력 후 빈 문자열 반환
		System.out.println(this.getCityName());
		return "";
	}

}
