import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // int[] numbers = { 2, 3, 5, 1, 4 };
        // no longer need to specify the size of the array
        // no longer changes the size of the array
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // [I@1b6d3586
        System.out.println(Arrays.toString(numbers)); // [1, 2, 0, 0, 0]
          
        System.out.println("Length: " + numbers.length); // Length: 5
        System.out.println("First element: " + numbers[0]); // First element: 1
        numbers[0] = 10;
        System.out.println("First element: " + numbers[0]); // First element: 10
        numbers[2] = 3;
        System.out.println("Third element: " + numbers[2]); // Third element: 3
        numbers[3] = 4;
        numbers[4] = 5;
        // numbers[5] = 6; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        System.out.println("for each loop");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("for loop");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Arrays.stream");
        Arrays.stream(numbers).forEach(System.out::println);  
        

        // Arrays class
        int[] numbers2 = { 2, 3, 5, 1, 4 };
        System.out.println(Arrays.toString(numbers2)); // [2, 3, 5, 1, 4]
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2)); // [1, 2, 3, 4, 5]
        Arrays.fill(numbers2, 10);
        System.out.println(Arrays.toString(numbers2)); // [10, 10, 10, 10, 10]
          
        // 2D Arrays
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j=0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
        System.out.println(Arrays.deepToString(board)); // [[-, -, -], [-, -, -], [-, -, -]]
        board[0][0] = 'X';
        board[1][1] = 'X';
        board[2][2] = 'X';
        System.out.println(Arrays.deepToString(board)); // [[X, -, -], [-, X, -], [-, -, X]]
        
        char[][] board2 = {
            { '-', '-', '-' },
            { '-', '-', '-' },
            { '-', '-', '-' }
        };

        System.out.println(Arrays.deepToString(board2)); // [[-, -, -], [-, -, -], [-, -, -]]
        
        char[][] board3 = new char[][] {
            new char[] { '-', '-', '-' },
            new char[] { '-', '-', '-' },
            new char[] { '-', '-', '-' }
        };

        System.out.println(Arrays.deepToString(board3)); // [[-, -, -], [-, -, -], [-, -, -]]
        

        // Jagged Arrays
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[10];
        
        System.out.println(Arrays.deepToString(jaggedArray)); // [[0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]]
        
        int[][] jaggedArray2 = {
            { 1, 2, 3 },
            { 4, 5, 6, 7, 8 },
            { 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 }
        };

        System.out.println(Arrays.deepToString(jaggedArray2)); // [[1, 2, 3], [4, 5, 6, 7, 8], [9, 10, 11, 12, 13, 14, 15, 16, 17, 18]]

        // Array of Objects
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "!";
        System.out.println(Arrays.toString(strings)); // [Hello, World, !]
        
        String[] strings2 = { "Hello", "World", "!" };
        System.out.println(Arrays.toString(strings2)); // [Hello, World, !]
        
        String[][] strings3 = new String[3][];
        strings3[0] = new String[3];
        strings3[1] = new String[5];
        strings3[2] = new String[10];
        
        System.out.println(Arrays.deepToString(strings3)); // [[null, null, null], [null, null, null, null, null], [null, null, null, null, null, null, null, null, null, null]]
        
        String[][] strings4 = {
            { "Hello", "World", "!" },
            { "Hello", "World", "!", "Hello", "World" },
            { "Hello", "World", "!", "Hello", "World", "!", "Hello", "World", "!", "Hello" }
        };

        System.out.println(Arrays.deepToString(strings4)); // [[Hello, World, !], [Hello, World, !, Hello, World], [Hello, World, !, Hello, World, !, Hello, World, !, Hello]]
    //
        
    }
}
