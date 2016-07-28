package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeRecursion {
	String reverse = "";

	public String reverseString(String s) {
		if (s.length() == 1)
			return s;
		else {
			reverse += s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
		}
		return reverse;
	}

	public static void main(String[] args) throws IOException {
		PalindromeRecursion obj = new PalindromeRecursion();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String a = br.readLine();
		String reverseString = obj.reverseString(a);
		System.out.println(reverseString);

		if (reverseString.equals(a)) {
			System.out.println("It is a Palinndrome");
		} else {
			System.out.println("It is not a Palindrome");
		}
		

	}

}
