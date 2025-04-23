package com.vardhan.ExceptionHandling;
import java.util.*;
public class ATMSimulator {
    public static void main(String[] args) {
        String correctPin = "1234";
        double balance = 5000;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Insert card... Enter PIN: ");
            String enteredPin = sc.nextLine();

            try {
                if (!enteredPin.equals(correctPin)) {
                    throw new SecurityException("Incorrect PIN entered.");
                }

                System.out.println("PIN verified.");
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();

                try {
                    if (amount > balance) {
                        throw new IllegalArgumentException("Insufficient balance.");
                    } else if (amount <= 0) {
                        throw new IllegalArgumentException("Invalid withdrawal amount.");
                    }

                    balance -= amount;
                    System.out.println("Please collect your cash. Remaining balance: " + balance);

                } catch (IllegalArgumentException e) {
                    System.out.println("Transaction error: " + e.getMessage());
                }

            } catch (SecurityException e) {
                System.out.println("Authentication failed: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
