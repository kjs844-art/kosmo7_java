package length;

public class Stringmain3 {

	public static void main(String[] args) {
		// before: main()를 먼저 닫아서 아래 코드가 메서드 밖으로 나가 있었음
		// after: 문자열 관련 코드를 모두 main() 안으로 넣어서 실행 가능하게 만든다.
		String n1 = "abc";
		String n2 = "abc";
		String n3 = new String("abc");
		String n4 = new String("abc");

		System.out.println(n1.toString());
		System.out.println(n3);
		// before: system.out.println(n1==n2);
		// after: 자바는 대소문자를 구분하므로 System으로 써야 한다.
		System.out.println(n1 == n2);
		System.out.println(n3 == n4);
		System.out.println(n1 == n3);
		System.out.println(n1.equals(n4));

		// String은 불변이라 새 문자열을 만들어 다시 대입한다.
		n3 = n3 + " : " + n4;
		System.out.println(n3);

		StringBuffer sb = new StringBuffer("abc");
		// before: st.append("1");
		// after: 선언한 변수명이 sb 이므로 같은 이름으로 호출해야 한다.
		sb.append("1");
		sb.append(1);

		String result = sb.toString();
		System.out.println(result);
	}
}
