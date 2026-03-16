package Weather;

public class WeatherMaker {

    private String info;

    public WeatherMaker() {
        // 원본 문자열 데이터
        this.info = "서울-대전-대구-부산-인천-제주";
    }

    public String[] init() {
        // split("-")은 - 기호를 기준으로 문자열을 잘라서 배열로 만든다.
        // 예: "서울-대전-대구" -> {"서울", "대전", "대구"}
        return this.info.split("-");
    }
}
