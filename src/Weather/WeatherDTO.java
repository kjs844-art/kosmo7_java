package Weather;

public class WeatherDTO {

    // 도시 이름을 저장하는 변수
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return this.cityName;
    }
}
