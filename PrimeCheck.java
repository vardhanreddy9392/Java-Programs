package vardhan.javaprograms;

import java.util.Scanner;

public class PrimeCheck {

	static boolean checkPrime(int n) {

		int cnt = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				cnt = cnt + 1;
				if (n / i != i) {
					cnt = cnt + 1;
				}
			}
		}
		if (cnt == 2) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isPrime = checkPrime(n);
		if (isPrime) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}
	}
}
