
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithHashMap {

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    static class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", age=" + age + "]";
        }
    }

    public static void main(String[] args) {
        Map<Person, Student> hashMap = new HashMap<>();
        Person john = new Person("John", 20);
        Student johnStudent = new Student("John", 20);
        hashMap.put(john, johnStudent);
        System.out.println(hashMap);

        Student retrievedStudent = hashMap.get(new Person("John", 20)); // Retrieve the Student using a different Person object
        System.out.println("Retrieved Student: " + retrievedStudent); // Print the retrieved Student

        System.out.println(john.hashCode()); // Print the hash code for the original Person object
        System.out.println(new Person("John", 20).hashCode()); // Print the hash code for a different Person object with the same values
    }
}

