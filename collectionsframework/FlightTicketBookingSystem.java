package com.vardhan.collectionsframework;

import java.util.*;

class Passenger {
    String name;
    int priority; // lower value = higher priority
    boolean isPriority;

    public Passenger(String name, int priority, boolean isPriority) {
        this.name = name;
        this.priority = priority;
        this.isPriority = isPriority;
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

class PriorityPassengerComparator implements Comparator<Passenger> {
    public int compare(Passenger p1, Passenger p2) {
        return Integer.compare(p1.priority, p2.priority);
    }
}

public class FlightTicketBookingSystem {
    public static void main(String[] args) {
        Queue<Passenger> normalQueue = new LinkedList<>();

        PriorityQueue<Passenger> priorityQueue = new PriorityQueue<>(new PriorityPassengerComparator());

        // Adding passengers
        normalQueue.add(new Passenger("Alice", 5, false));
        normalQueue.add(new Passenger("Bob", 4, false));
        priorityQueue.add(new Passenger("Charlie", 1, true));
        priorityQueue.add(new Passenger("David", 2, true));
        priorityQueue.add(new Passenger("Eve", 3, true));

        System.out.println("Processing Priority Bookings:");
        while (!priorityQueue.isEmpty()) {
            System.out.println("Booked: " + priorityQueue.poll());
        }

        System.out.println("\nProcessing Normal Bookings:");
        while (!normalQueue.isEmpty()) {
            System.out.println("Booked: " + normalQueue.poll());
        }
    }
}
