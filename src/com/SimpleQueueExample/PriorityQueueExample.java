package com.SimpleQueueExample;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Using offer() to add elements with natural ordering (lexicographical order for strings)
        priorityQueue.offer("Bob");
        priorityQueue.offer("Alice");
        priorityQueue.offer("Charlie");
        System.out.println(priorityQueue);
        // Using peek() to peek at the element with the highest priority
        String highestPriorityElement = priorityQueue.peek();
        System.out.println("Highest Priority Element: " + highestPriorityElement);

        // Using poll() to retrieve and remove elements based on priority
        String dequeuedElement1 = priorityQueue.poll();
        String dequeuedElement2 = priorityQueue.poll();

        System.out.println("Dequeued Elements: " + dequeuedElement1 + ", " + dequeuedElement2);

        // Using add() to add elements with priority (requires Comparable or Comparator)
        priorityQueue.add("David");
        priorityQueue.add("Anna");

        // Display the current state of the priority queue
        System.out.println("Current Priority Queue: " + priorityQueue);
    }
}
