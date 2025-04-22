package vardhan.javaprograms;

import java.util.Scanner;

public class FibonacciSeries {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter how many Fibonacci numbers to generate: ");
	        int n = sc.nextInt();
	        int first = 0, second = 1, count = 0;
	        if (n <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            System.out.print("Fibonacci Series: ");
	            do {
	                System.out.print(first + " ");
	                int next = first + second;
	                first = second;
	                second = next;
	                count++;
	            } while (count < n);
	        }
	    }
	}
