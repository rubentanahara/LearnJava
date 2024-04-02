package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

import OOP.User;

public class HelloWorld { // The program search for the static main method
    static int age; // global variable

    public static void main(String[] args) { // Pass to the program in ejecution
        // Variables
        // Entities to store value
        // Integers
        int age; // declare variable
        age = 25; // define variable
        // you can't declare variables like:
        // int 0age
        // int my age
        System.out.println("Basics on Java");
        System.out.println("I'm " + age + " years old."); // this is a local btw

        byte aSingleByte = 100; // -128 a 127
        short aSmallNumber = 20000; // -32,768 to 32,767
        int aInteger = 2147483647; // -2147483648 to 2147483647
        long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

        // decimal types
        double aDouble = 1.797669313; // 4.9E-324 to 1.7976931348623157E308
        float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38

        // booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        // characters
        char copyright = '\u00A9';
        char percentSymbol = '%';

        // Type conversion
        // Implicit

        int number1 = 5;
        double number2 = number1;

        System.out.println(number2);

        double number3 = 2.8;
        int number4 = (int) number3; // use int to convert to int
        String ms = "1";
        int u = Integer.parseInt(ms);

        System.out.println(number4);

        // operators

        int number5 = 12;
        int number7 = 6;

        // the result will be int

        // addition
        System.out.println(number5 + number7);
        // substraction
        System.out.println(number5 - number7);
        // multiplication
        System.out.println(number5 * number7);
        // division
        System.out.println(number5 / number7);
        // modulo
        System.out.println(number5 % number7);

        // re asignation
        int num = 5;
        num += 12;
        System.out.println(num);

        // relation ops

        System.out.println(number5 == number7);
        System.out.println(number5 != number7);
        System.out.println(number5 > number7);
        System.out.println(number5 < number7);
        System.out.println(number5 <= number7);
        System.out.println(number5 >= number7);

        // logical operators
        System.out.println(number7 >= 5 && number5 <= 5);

        boolean isStudent = false;
        boolean isLibraryMember = true;

        System.out.println(isStudent || isLibraryMember);

        int score = 0;
        int turns = 10;

        // increment and decrement op

        score++;
        turns--;

        System.out.println(score);
        System.out.println(turns);

        System.out.println(++score);
        System.out.println(--turns);

        // Strings

        String name = "Ruben Tanahara";
        String name2 = new String("Ruben Tanahara");
        System.out.println(name);
        System.out.println(name2);

        String a = "abc";
        String b = "abc";

        String c = new String("xyz");
        String d = new String("xyz");

        System.out.println(a == b);
        System.out.println(c == d);

        String myName = "Ruben Tanahara";
        String country = "Mexico";
        int myAge = 25;
        String company = "gdl connect";
        double gpa = 3.8;
        char percentSign = '%';

        String msg = String.format(
                "My name is %s. I'm from %s. I'm %d years old. I work for %s. my gpa is %f , i'm 100%c happy", myName,
                country, myAge, company, gpa, percentSign);

        System.out.println(msg);

        // Length
        //
        System.out.println(myName.length());
        System.out.println(myName.isEmpty());
        System.out.println(myName.trim());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());
        System.out.println(myName.equals(myName));
        System.out.println(myName.equalsIgnoreCase(myName.toUpperCase()));

        String string = "the sky is blue";
        System.out.println(string);
        System.out.println(string.replace("blue", "red"));
        System.out.println(string.contains("sky"));

        // Inputs
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("What is your name? ");
        // String name3 = scanner.nextLine();
        // System.out.println(String.format("My name is %s", name3));
        // System.out.printf("What is your age %s? ", name3);
        // int AGE = scanner.nextInt();
        // // or
        // // int AGE = Integer.parseInt(scanner.nextLine());
        // // double gdp = Double.parseDouble(scanner.nextLine());
        // // scanner.nextLine(); // clean up the input buffer
        // System.out.printf("%d is an excellent age to start programming", AGE);
        // System.out.println("");
        // scanner.close();

        // conditionals statments

        // calculator

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Enter the first number ");
        double numberOne = scanner2.nextDouble();
        scanner2.nextLine();
        System.out.println("Enter the first number ");
        double numberTwo = scanner2.nextDouble();
        scanner2.nextLine();

        System.out.println("What operation do you want to do?");

        String op = scanner2.nextLine();

        // if (op.equals("sum")) {
        // System.out.printf("%f + %f = %f", numberOne, numberTwo, numberOne +
        // numberTwo);
        // } else if (op.equals("sub")) {
        // System.out.printf("%f - %f = %f", numberOne, numberTwo, numberOne -
        // numberTwo);
        // } else if (op.equals("mul")) {
        // System.out.printf("%f * %f = %f", numberOne, numberTwo, numberOne *
        // numberTwo);
        // } else if (op.equals("div")) {
        // if (number2 == 0) {
        // System.out.println("can not divide by zero");
        // } else {
        // System.out.printf("%f / %f = %f", numberOne, numberTwo, numberOne /
        // numberTwo);
        // }
        // } else {
        // System.out.printf("%s is not a suppported operation", op);
        // }

        switch (op) {
            case "sum":
                System.out.printf("%f + %f = %f", numberOne, numberTwo, numberOne + numberTwo);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", numberOne, numberTwo, numberOne + numberTwo);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", numberOne, numberTwo, numberOne + numberTwo);
                break;
            case "div":
                if (number2 == 0) {
                    System.out.println("can not divide by zero");
                    break;
                }
                System.out.printf("%f / %f = %f", numberOne, numberTwo, numberOne + numberTwo);
                break;
            default:
                System.out.printf("%s is not a suppported operation", op);
                break;
        }
        scanner2.close();

        // Arrays

        char MY_NAME[] = new char[5];

        MY_NAME[0] = 'r';
        MY_NAME[1] = 'u';
        MY_NAME[2] = 'b';
        MY_NAME[3] = 'e';
        MY_NAME[4] = 'n';

        System.out.println(Arrays.toString(MY_NAME));
        MY_NAME[0] = 'R';
        System.out.println(MY_NAME.length);
        int start_idx = 1;
        int end_idx = 4;
        Arrays.sort(MY_NAME, start_idx, end_idx);
        char key = 'u';
        int foundItemIdx = Arrays.binarySearch(MY_NAME, key);
        System.out.println(Arrays.toString(MY_NAME));
        System.out.println(MY_NAME[foundItemIdx]);
        Arrays.fill(MY_NAME, 'x'); // fill all the arrray with that character (will replace all items) , you can
                                   // specify the range
        char copy[] = Arrays.copyOf(MY_NAME, MY_NAME.length);
        System.out.println(Arrays.toString(copy));

        int numberss[] = { 1, 2, 3, 4, 5 };

        int start = 0;
        int end = 10;

        int copyNumberss[] = Arrays.copyOfRange(numberss, start, end);

        System.out.println(Arrays.equals(MY_NAME, copy));

        // For loops

        for (int i = 0; i < copyNumberss.length; i++) {
            System.out.println(copyNumberss[i]);
        }

        for (int element : copyNumberss) {
            System.out.println(element);
        }

        for (int number = 1; number <= 10; number++) {
            for (int multiplier = 1; multiplier <= 10; multiplier++) {
                System.out.printf("%d x %d = %d", number, multiplier, number * multiplier);
            }
        }

        int arr[] = { 1, 2, 3, 4, 5 };

        for (int number : arr) {
            System.out.println(number);
        }

        int n = 5;
        int m = 1;

        while (m <= 10) {
            System.out.printf("%d x %d = %d", n, m, n * m);
            m++;
        }

        do {
            System.out.printf("%d x %d = %d", n, m, n * m);
            m++;

        } while (m <= 10);

        // ArrayLists

        ArrayList<Integer> NUMBERS = new ArrayList<Integer>();

        // int double float boolean
        // Integer Double Float Boolean

        NUMBERS.add(1);
        NUMBERS.add(2);
        NUMBERS.add(3);
        NUMBERS.add(4);
        NUMBERS.add(5);
        NUMBERS.add(6);
        NUMBERS.add(7);
        NUMBERS.add(8);

        System.out.println(NUMBERS.toString());
        System.out.println(NUMBERS.get(0));
        NUMBERS.remove(7);
        NUMBERS.remove(Integer.valueOf(4));
        NUMBERS.set(1, 100);
        NUMBERS.sort(Comparator.naturalOrder());
        NUMBERS.size();
        NUMBERS.contains(Integer.valueOf(10));
        NUMBERS.isEmpty();

        NUMBERS.forEach(item -> {
            NUMBERS.set(NUMBERS.indexOf(item), item * 2);
            System.out.println(item * 2);
        });
        NUMBERS.clear();

        // Hash maps

        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Math", 95);
        examScores.put("English", 100);
        examScores.put("History", 79);

        System.out.println(examScores.get("Math"));
        examScores.putIfAbsent("Math", 70);
        examScores.replace("English", 85);
        System.out.println(examScores.toString());
        examScores.getOrDefault("Letters", 0);
        examScores.remove("History");
        examScores.containsKey("Math");
        examScores.isEmpty();
        examScores.forEach((k, v) -> {
            examScores.replace(k, v - 10);
        });
        System.out.println(examScores.toString());

        // oop

        User newUser = new User("Ruben Tanahara", "1999-01-13");
        // newUser.name = "Ruben Tanahara";
        // newUser.birthday = LocalDate.parse("1999-01-13");
        newUser.getAge();
        newUser.getName();

        // System.out.printf("%s was born back in %s",newUser.name, newUser.birthday);
        System.out.printf("%s was born back in %s", newUser.getName(), newUser.getAge());

    }
}
