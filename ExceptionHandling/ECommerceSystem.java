package com.vardhan.ExceptionHandling;

public class ECommerceSystem {

	public static void main(String[] args) {
		try {
			processOrder("user123", "item456", 0);
		} catch (IllegalArgumentException | NullPointerException ex) {
			System.out.println("Error processing order: " + ex.getMessage());
		}
	}

	public static void processOrder(String userId, String itemId, int quantity) {
		if (userId == null || itemId == null) {
			throw new NullPointerException("User ID or Item ID is null");
		}
		if (quantity <= 0) {
			throw new IllegalArgumentException("Quantity must be greater than zero");
		}

		System.out.println("Order processed for user " + userId + " for item " + itemId);
	}
}
