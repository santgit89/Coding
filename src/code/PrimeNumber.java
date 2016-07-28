package code;

import java.util.Scanner;

public class PrimeNumber {

	public boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
public void generatePrime(int limit){
	for (int i = 2; i < limit; i++) {
		for(int j=2;j<=i;j++){
			if(j==1)
				System.out.println(i);
			if(i%j==0){
				break;
			}
				
		}
		
	}
	
}
	public static void main(String[] args) {
		PrimeNumber nb = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean s = nb.isPrime(n);
		if (s) {
			System.out.println("Is Prime");
		} else
			System.out.println("Not prime");
		nb.generatePrime(n);
	}
}
