package Weather;

public class WeatherMain {

    public static void main(String[] args) {
        WeatherMaker wm = new WeatherMaker();

        // WeatherMaker 에서 도시 이름 배열을 받아온다.
        String[] ar = wm.init();

        // WeatherDTO 객체들을 저장할 배열을 만든다.
        WeatherDTO[] weathers = new WeatherDTO[ar.length];

        for (int i = 0; i < ar.length; i++) {
            WeatherDTO w = new WeatherDTO();

            // 배열의 문자열 값을 DTO 에 넣는다.
            w.setCityName(ar[i]);

            // 만든 DTO 를 배열에 저장한다.
            weathers[i] = w;

            // 저장된 DTO 의 도시 이름을 출력한다.
            System.out.println(weathers[i].getCityName());
        }
    }
}
