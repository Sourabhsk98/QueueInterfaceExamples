package com.SimpleQueueExample;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {


        Queue<String> simpleQueue = new LinkedList<String>();

        // Using offer() to add elements
        boolean added1 = simpleQueue.offer("Sourabh");
        boolean added2 = simpleQueue.offer("Kiran");
        boolean added3 = simpleQueue.offer("Ajeet");

        System.out.println("Elements added successfully? " + added1 + ", " + added2 + ", " + added3);
        System.out.println("Current Queue:"+simpleQueue);

        // Using peek() to retrieve, without removing
        String peekedName = simpleQueue.peek();
        System.out.println("Peeked: " + peekedName);
        System.out.println("Current Queue:"+simpleQueue);

        // Using poll() to retrieve and remove
        String dequeuedName = simpleQueue.poll();
        System.out.println("Dequeued: " + dequeuedName);
        System.out.println("Current Queue:"+simpleQueue);

        // Using element() to retrieve, without removing (throws exception if empty)
        try {
            String frontElement = simpleQueue.element();
            System.out.println("Element at the front: " + frontElement);
        } catch (Exception e) {
            System.out.println("Queue is empty.");
        }

        // Using remove() to retrieve and remove (throws exception if empty)
        try {
            String removedElement = simpleQueue.remove();
            System.out.println("Removed: " + removedElement);
        } catch (Exception e) {
            System.out.println("Queue is empty.");
        }

        // Display the current state of the queue
        System.out.println("Current Queue: " + simpleQueue);
    }
}