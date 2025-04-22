package vardhan.javaprograms;

public class TypePromotion {
	public static void main(String[] args) {
		int i = 10;
		float f = 5.5f;
		double d = 20.99;
		char c = 'A'; // ASCII value = 65

		double result1 = i + f + d;
		float result2 = i + f;
		int result3 = i + c;
		double result4 = c + d;

		System.out.println("int + float + double = " + result1);
		System.out.println("int + float = " + result2);
		System.out.println("int + char = " + result3);
		System.out.println("char + double = " + result4);

	}
}
