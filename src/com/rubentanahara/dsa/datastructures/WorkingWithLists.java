import java.util.List;
import java.util.ArrayList;

public class WorkingWithLists {
    public static void main(String[] args) {
          // unmodifiable list
          List<String> names = List.of("John", "Paul", "George", "Ringo");
          System.out.println(names); // [John, Paul, George, Ringo]
          // names.add("Stuart"); // Exception in thread "main" java.lang.UnsupportedOperationException
          // names.remove(0); // Exception in thread "main" java.lang.UnsupportedOperationException
    //    names.set(0, "Stuart"); // Exception in thread "main" java.lang.UnsupportedOperationException
    //    names.clear(); // Exception in thread "main" java.lang.UnsupportedOperationException
    //    names.sort(); // Exception in thread "main" java.lang.UnsupportedOperationException
    //    names.replaceAll(String::toUpperCase); // Exception in thread "main" java.lang.UnsupportedOperationException
    //    names.removeIf(name -> name.startsWith("J")); // Exception in thread "main" java.lang.UnsupportedOperationExceptionº

          // List
          List<String> numbers = new ArrayList<>();
          numbers.add("one");
          numbers.add("two");
          numbers.add("three");

          System.out.println(numbers); // [1, 2, 3]
          System.out.println(numbers.size()); // 3
          System.out.println(numbers.contains("two")); // true

          for (String number : numbers) {
              System.out.println(number);
          }
          
          numbers.forEach(System.out::println);

          for (int i = 0; i < numbers.size(); i++) {
              System.out.println(numbers.get(i));
          }
    
      }
}
