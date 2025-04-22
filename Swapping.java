package vardhan.javaprograms;

import java.util.Scanner;

public class Swapping {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a");
		int a=sc.nextInt();
		System.out.println("Enter Value for b");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a=" +a+ "\nb="+b);
	}

}
