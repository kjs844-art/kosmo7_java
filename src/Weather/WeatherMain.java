package Weather;

// main 메서드를 가진 실행 클래스
public class WeatherMain {

    public static void main(String[] args) {
        WeatherMaker wm = new WeatherMaker();

        // wm.init()의 결과는 DTO 객체 1개가 아니라
        // DTO 객체 여러 개의 주소가 들어 있는 배열이다.
        WeatherDTO[] ar = wm.init();

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i].getCityName());
        }
    }
}
