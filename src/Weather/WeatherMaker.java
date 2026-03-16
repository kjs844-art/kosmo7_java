package Weather;

// WeatherMaker:
// 실제 데이터를 만들어서 가공하는 역할의 클래스
public class WeatherMaker {

    private String info;

    // 생성자:
    // 클래스 이름과 같은 이름을 가지며
    // 객체가 만들어질 때 자동으로 한 번 실행된다.
    public WeatherMaker() {
        this.info = "서울-대전-대구-부산";
    }

    // init:
    // initialize의 줄임말로
    // 초기 데이터 준비, 생성, 세팅할 때 자주 쓰는 메서드 이름이다.
    public WeatherDTO[] init() {
        String[] ar = this.info.split("-");

        // WeatherDTO 객체들의 주소(참조값)를 저장할 배열
        WeatherDTO[] weathers = new WeatherDTO[ar.length];

        for (int i = 0; i < ar.length; i++) {
            WeatherDTO w = new WeatherDTO();
            w.setCityName(ar[i]);
            weathers[i] = w;
        }

        // return:
        // 메서드 실행 결과를 밖으로 돌려주는 것
        return weathers;
    }
}
