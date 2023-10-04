//Queues are used to store data in the order in which they occur.

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("bottom");
        printQueue(queue);
        queue.add("second");
        printQueue(queue);
        queue.add("third");
        printQueue(queue);
        queue.add("top");
        printQueue(queue);
        queue.remove();
        printQueue(queue);
        queue.remove();
        printQueue(queue);
        queue.remove();
        printQueue(queue);
        queue.remove();
        printQueue(queue);


        //supermarket queue example
        Queue<Person> supermarketQueue = new LinkedList<>();
        supermarketQueue.add(new Person("John", 20));
        printPersonQueue(supermarketQueue);
        supermarketQueue.add(new Person("Paul", 30));
        printPersonQueue(supermarketQueue);
        supermarketQueue.add(new Person("George", 40));
        printPersonQueue(supermarketQueue);
        supermarketQueue.add(new Person("Ringo", 50));
        printPersonQueue(supermarketQueue);
        supermarketQueue.remove();
        printPersonQueue(supermarketQueue);
        supermarketQueue.remove();
        printPersonQueue(supermarketQueue);
        supermarketQueue.remove();
        printPersonQueue(supermarketQueue);
        supermarketQueue.remove();
        printPersonQueue(supermarketQueue);
        
      //Examples with queue methods 
        supermarketQueue.add(new Person("John", 20));
        printPersonQueue(supermarketQueue);
        supermarketQueue.add(new Person("Paul", 30));
        printPersonQueue(supermarketQueue);
        supermarketQueue.add(new Person("George", 40));
        printPersonQueue(supermarketQueue);
        supermarketQueue.add(new Person("Ringo", 50));
        printPersonQueue(supermarketQueue);

      //peek() returns the head of the queue or null if the queue is empty
      System.out.println("Peek: " + supermarketQueue.peek());
      
      //element() returns the head of the queue or throws an exception if the queue is empty
      System.out.println("Element: " + supermarketQueue.element());

      //poll() returns the head of the queue or null if the queue is empty
      System.out.println("Poll: " + supermarketQueue.poll());
      
      //remove() returns the head of the queue or throws an exception if the queue is empty
      System.out.println("Remove: " + supermarketQueue.remove());

      //offer() adds an element to the queue and returns true if successful
      System.out.println("Offer: " + supermarketQueue.offer(new Person("John", 20)));

      //add() adds an element to the queue and returns true if successful
      System.out.println("Add: " + supermarketQueue.add(new Person("Paul", 30)));

      //size() returns the number of elements in the queue
      System.out.println("Size: " + supermarketQueue.size());

      //isEmpty() returns true if the queue is empty
      System.out.println("Is empty: " + supermarketQueue.isEmpty());

      //contains() returns true if the queue contains the specified element
      System.out.println("Contains: " + supermarketQueue.contains(new Person("John", 20)));

      //clear() removes all elements from the queue
      supermarketQueue.clear();
      System.out.println("Clear: " + supermarketQueue);

    }
    private static void printPersonQueue(Queue<Person> queue) {
        if (queue.isEmpty()) {
            System.out.println("You have nothing in your queue");
        } else {
            System.out.printf("%s TOP, size: %s \n", queue, queue.size());
        }
    }

    private static void printQueue(Queue<String> queue) {
        if (queue.isEmpty()) {
            System.out.println("You have nothing in your queue");
        } else {
            System.out.printf("%s TOP, size: %s \n", queue, queue.size());
        }
    }
    //record Person(String name, int age) {}
  // what is a record? a record is a class that is used to store data
    static record Person(String name, int age) {}
}

