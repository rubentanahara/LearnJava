
import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

    record Person(String name, int age) {}

    public static void main(String[] args) {
        Map<Integer, Person> hashMap = new HashMap<>();
        demonstrateMapOperations(hashMap);

        // Additional map for putAll and replace demonstration
        Map<Integer, Person> hashMap2 = new HashMap<>();
        hashMap2.put(5, new Person("Stuart", 60));
        hashMap2.put(6, new Person("Dave", 70));

        hashMap.putAll(hashMap2);
        printMap(hashMap);

        hashMap.replace(1, new Person("John", 21));  // Updated age
        printMap(hashMap);
        hashMap.replace(2, new Person("Paul", 31));  // Updated age
        printMap(hashMap);
    }

    private static void demonstrateMapOperations(Map<Integer, Person> map) {
        // Add some entries to the map
        map.put(1, new Person("John", 20));
        printMap(map);
        map.put(2, new Person("Paul", 30));
        printMap(map);
        map.put(3, new Person("George", 40));
        printMap(map);
        map.put(4, new Person("Ringo", 50));
        printMap(map);

        // Perform various map operations
        map.remove(1);
        printMap(map);

        map.clear();
        printMap(map);

        // Other map operations...
        System.out.println("Contains key 1: " + map.containsKey(1));
        System.out.println("Contains value Person(\"John\", 20): " + map.containsValue(new Person("John", 20)));
        System.out.println("Is empty: " + map.isEmpty());
        System.out.println("Size: " + map.size());
        System.out.println("Get value for key 2: " + map.get(2));
        System.out.println("Get value for key 1: " + map.getOrDefault(1, new Person("Stuart", 60)));
        System.out.println("Get value for key 1: " + map.getOrDefault(1, null));
  

        // Print the final map
        printMap(map);
    }

    private static void printMap(Map<Integer, Person> map) {
        if (map.isEmpty()) {
            System.out.println("Map is empty.");
        } else {
            System.out.println("Map: " + map);
            System.out.println("Size: " + map.size());
        }
        System.out.println();
    }
}

