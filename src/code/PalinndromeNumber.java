package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalinndromeNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n=Integer.parseInt(br.readLine());
		int reverse=0;
		System.out.println(n);
		while(n!=0){
			int number=n%10;
			reverse =reverse*10+ number;
			n=n/10;
		}
		System.out.println(reverse);
		
	}

}
