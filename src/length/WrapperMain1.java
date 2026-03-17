package length;

public class WrapperMain1 {

	public static void main(String[] args) {
		String n = "123";

		Integer integer = Integer.valueOf(n);
		// before: Long 1 = Long.valueOf(n);
		// after: 변수명은 숫자로만 만들 수 없어서 의미 있는 이름으로 바꾼다.
		Long longValue = Long.valueOf(n);

		System.out.println(integer + 1);
		System.out.println(longValue + 1);

		// auto-boxing
		int num = 3;
		integer = num;

		// auto-unboxing
		num = integer;

		long number = 3L;
		integer = (int) number;
		// before: num = (int);
		// after: 형변환은 값과 같이 써야 하므로 number를 붙여야 한다.
		num = (int) number;

		// parsing
		num = Integer.parseInt("123");
		System.out.println(num);
	}
}
