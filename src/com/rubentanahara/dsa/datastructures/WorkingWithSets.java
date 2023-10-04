//Sets 
//

import java.util.*;

public class WorkingWithSets {
  public static void main(String[] args) {
    // using a set to remove duplicates
    Set<String> set = new HashSet<>();
    set.add("one");
    set.add("two");
    set.add("three");
    set.add("one");
    set.add("two");
    set.add("three");
    System.out.println(set); // [one, two, three]

    // Set
    Set<String> set2 = new HashSet<>();
    set2.add("one");
    set2.add("two");
    set2.add("three");
    set2.add("four");
    set2.add("five");
    set2.add("six");
    System.out.println(set2); // [one, two, three, four, five, six]

    // union
    Set<String> union = new HashSet<>(set);
    union.addAll(set2);
    System.out.println(union); // [one, two, three, four, five, six]

    // intersection
    Set<String> intersection = new HashSet<>(set);
    intersection.retainAll(set2);
    System.out.println(intersection); // [one, two, three]

    // difference
    Set<String> difference = new HashSet<>(set);
    difference.removeAll(set2);
    System.out.println(difference); // []

    // difference
    Set<String> difference2 = new HashSet<>(set2);
    difference2.removeAll(set);
    System.out.println(difference2); // [four, five, six]

    // subset
    System.out.println(set.containsAll(set2)); // false
    
    //subset
    System.out.println(set2.containsAll(set)); // true

    // subset
    System.out.println(set.containsAll(intersection)); // true
    
    //subset
    System.out.println(set2.containsAll(intersection)); // true

    // subset
    System.out.println(set.containsAll(difference)); // true

    // subset
    System.out.println(set2.containsAll(difference2)); // true
    //

    // Set
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    System.out.println(numbers); // [1, 2, 3, 4, 5, 6]
    //
    //
    Set<Ball> balls = new HashSet<>();
    balls.add(new Ball("red"));
    balls.add(new Ball("blue"));
    balls.add(new Ball("red"));
    balls.add(new Ball("blue"));
    balls.add(new Ball("red"));
    balls.add(new Ball("blue"));
    System.out.println(balls); // [red, blue]
    
    // Get the number of elements in the set
    System.out.println(balls.size()); // 2
    // Check if the set is empty
    System.out.println(balls.isEmpty()); // false
    // Check if the set contains an element
    System.out.println(balls.contains(new Ball("red"))); // true
    // Remove an element from the set
    balls.remove(new Ball("red"));
    System.out.println(balls); // [blue]
    // Remove all elements from the set
    balls.clear();
    System.out.println(balls); // []
    // Add all elements from another set
     balls.addAll(new HashSet<>(Arrays.asList(new Ball("red"), new Ball("blue"))));
    System.out.println(balls); // [red, blue]
    
    // Iterate over the set
    // for each loop
    for (Ball ball : balls) {
      System.out.println(ball);
    }
    // for loop
    for (Iterator<Ball> iterator = balls.iterator(); iterator.hasNext();) {
      Ball ball = iterator.next();
      System.out.println(ball);
    }
    // forEach
    balls.forEach(System.out::println);
    // stream
    balls.stream().forEach(System.out::println);
    // parallel stream
    balls.parallelStream().forEach(System.out::println);
    // spliterator
    balls.spliterator().forEachRemaining(System.out::println);
    // Get an array with the elements of the set
    Object[] array = balls.toArray();
    System.out.println(Arrays.toString(array)); // [red, blue]
    // Get a typed array with the elements of the set
    Ball[] array2 = balls.toArray(new Ball[0]);
    System.out.println(Arrays.toString(array2)); // [red, blue]

  
  }

  record Ball (String color) {
    public String toString() {
      return color;
    }
  }
  static class Ball2 {
    private String color;
    public Ball2(String color) {
      this.color = color;
    }
    public String toString() {
      return color;
    }
    public boolean equals(Object o) {
      if (o == this)
        return true;
      if (!(o instanceof Ball2))
        return false;
      Ball2 other = (Ball2) o;
      return Objects.equals(color, other.color);
    }
    public int hashCode() {
      return Objects.hash(color);
    }
  }
}
