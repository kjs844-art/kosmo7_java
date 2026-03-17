package length;

public class WrapperMain1 {

	public static void main(String[] args) {
		String n = "123";

		Integer integer = Integer.valueOf(n);
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
		num = (int) number;

		// parsing
		num = Integer.parseInt("123");
		System.out.println(num);
	}
}
