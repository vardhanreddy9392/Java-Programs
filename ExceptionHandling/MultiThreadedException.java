package com.vardhan.ExceptionHandling;

public class MultiThreadedException {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread running...");
                int result = 10 / 0;  // Will cause ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Exception in thread: " + e.getMessage());
            }
        });

        thread.start();
    }
}
