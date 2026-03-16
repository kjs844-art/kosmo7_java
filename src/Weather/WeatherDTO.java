package Weather;

// DTO(Data Transfer Object):
// 데이터를 담아서 전달하는 역할의 클래스
public class WeatherDTO {

    // cityName:
    // 도시 이름 1개를 저장하는 변수
    //
    // private:
    // 같은 클래스 안에서만 직접 접근 가능
    // 보통 변수는 private으로 숨기고 getter / setter를 사용한다.
    private String cityName;

    // getter:
    // 저장된 값을 꺼내는 메서드
    public String getCityName() {
        return cityName;
    }

    // setter:
    // 값을 저장하는 메서드
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return this.cityName;
    }
}
