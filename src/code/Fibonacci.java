package code;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0, b = 1, c;
		c = 0;
		int count = 10;

		System.out.print(a + " " + b);

		while (c <= count) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
			c++;
		}

	}

}
