package com.vardhan.ExceptionHandling;

import java.io.IOException;

//Custom Checked Exception
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom Unchecked Exception
class NegativeAmountException extends RuntimeException {
 public NegativeAmountException(String message) {
     super(message);
 }
}

class BankAccount {
 private String accountHolder;
 private double balance;

 public BankAccount(String accountHolder, double balance) {
     this.accountHolder = accountHolder;
     if (balance < 0) throw new NegativeAmountException("Initial balance cannot be negative.");
     this.balance = balance;
 }

 public void deposit(double amount) {
     if (amount <= 0) throw new NegativeAmountException("Deposit amount must be positive.");
     balance += amount;
 }

 public void withdraw(double amount) throws InsufficientFundsException {
     if (amount <= 0) throw new NegativeAmountException("Withdrawal amount must be positive.");
     if (amount > balance) throw new InsufficientFundsException("Insufficient funds for withdrawal.");
     balance -= amount;
 }

 public void printStatement() throws IOException {
     if (Math.random() > 0.8) throw new IOException("Failed to retrieve statement.");
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Current Balance: $" + balance);
 }
}

public class AdvancedBankingSystem {
 public static void main(String[] args) {
     try {
         BankAccount account = new BankAccount("Vardhan", 1000);
         account.deposit(500);
         account.withdraw(200);
         account.printStatement();
     } catch (InsufficientFundsException e) {
         System.out.println("Error: " + e.getMessage());
     } catch (IOException e) {
         System.out.println("IO Error: " + e.getMessage());
     } catch (NegativeAmountException e) {
         System.out.println("Invalid Amount: " + e.getMessage());
     }
 }
}
