package vardhan.javaprograms;

import java.util.Scanner;

public class DiscountCalculator {

    // Method to calculate the discounted price
    public static double calculateDiscountedPrice(double originalPrice, double discountPercentage) {
        double discountAmount = (originalPrice * discountPercentage) / 100;
        double discountedPrice = originalPrice - discountAmount;
        return discountedPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Calculate discounted price
        double discountedPrice = calculateDiscountedPrice(originalPrice, discountPercentage);

        // Output the result
        System.out.printf("The discounted price is: %.2f\n", discountedPrice);
    }
}
