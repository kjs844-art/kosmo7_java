package length;

public class Stringmain3 {

	public static void main(String[] args) {
		// The old code closed main() too early, so the lines below were outside any method.
		String n1 = "abc";
		String n2 = "abc";
		String n3 = new String("abc");
		String n4 = new String("abc");

		System.out.println(n1.toString());
		System.out.println(n3);
		// Java is case-sensitive, so "system" must be "System".
		System.out.println(n1 == n2);
		System.out.println(n3 == n4);
		System.out.println(n1 == n3);
		System.out.println(n1.equals(n4));

		// String은 불변이라 새 문자열을 만들어 다시 대입한다.
		n3 = n3 + " : " + n4;
		System.out.println(n3);

		StringBuffer sb = new StringBuffer("abc");
		// The old code used "st.append", but the declared variable name is sb.
		sb.append("1");
		sb.append(1);

		String result = sb.toString();
		System.out.println(result);
	}
}
