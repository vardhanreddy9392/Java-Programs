package vardhan.javaprograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void printForLoopTable(int N) {
		System.out.println("Multiplication Table of " + N + " using for loop:");
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
		}
	}

	public static void printWhileLoopTable(int N) {
		System.out.println("\nMultiplication Table of " + N + " using while loop:");
		int i = 1;
		while (i <= 10) {
			System.out.println(N + " x " + i + " = " + (N * i));
			i++;
		}
	}

	public static void printDoWhileLoopTable(int N) {
		System.out.println("\nMultiplication Table of " + N + " using do-while loop:");
		int i = 1;
		do {
			System.out.println(N + " x " + i + " = " + (N * i));
			i++;
		} while (i <= 10);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to print its multiplication table: ");
		int N = scanner.nextInt();

		printForLoopTable(N);
		printWhileLoopTable(N);
		printDoWhileLoopTable(N);

		scanner.close();
	}
}
