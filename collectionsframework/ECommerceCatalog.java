package com.vardhan.collectionsframework;

import java.util.*;

class Product {
    int id;
    String name;
    double price;
    String category;

    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class PriceComparator implements Comparator<Integer> {
    Map<Integer, Product> productMap;

    public PriceComparator(Map<Integer, Product> productMap) {
        this.productMap = productMap;
    }

    public int compare(Integer id1, Integer id2) {
        double p1 = productMap.get(id1).price;
        double p2 = productMap.get(id2).price;
        return Double.compare(p1, p2);
    }
}

public class ECommerceCatalog {
    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();

        products.put(101, new Product(101, "Laptop", 999.99, "Electronics"));
        products.put(102, new Product(102, "T-Shirt", 19.99, "Clothing"));
        products.put(103, new Product(103, "Smartphone", 699.00, "Electronics"));
        products.put(104, new Product(104, "Book", 15.50, "Books"));
        products.put(105, new Product(105, "Sneakers", 89.99, "Footwear"));

        TreeMap<Integer, Product> sortedByPrice = new TreeMap<>(new PriceComparator(products));
        sortedByPrice.putAll(products);

        Set<String> categories = new HashSet<>();
        for (Product p : products.values()) {
            categories.add(p.category);
        }

        System.out.println(" Sorted Products (by Price):");
        for (Map.Entry<Integer, Product> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("\n Available Categories:");
        for (String category : categories) {
            System.out.println("- " + category);
        }
    }
}
