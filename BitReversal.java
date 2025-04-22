package vardhan.javaprograms;

import java.util.Scanner;

public class BitReversal {
	 public static int reverseBits(int n) {
	        int result = 0;
	        for (int i = 0; i < 32; i++) {
	            result <<= 1;
	            result |= (n & 1);
	            n >>= 1;
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        int reversed = reverseBits(num);
	        System.out.println("Original: " + num);
	        System.out.println("Reversed: " + reversed);
	    }

}
