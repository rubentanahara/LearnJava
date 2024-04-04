import java.util.Stack;
// Purpose: Demonstrate how to use a stack

public class WorkingWithStacks {
    public static void main(String[] args) {
        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);
        stack.push("top");
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);


        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        printIntegerStack(stack2);
        stack2.push(2);
        printIntegerStack(stack2);
        stack2.push(3);
        printIntegerStack(stack2);
        stack2.push(4);
        printIntegerStack(stack2);
        stack2.pop();
        printIntegerStack(stack2);
        stack2.pop();
        printIntegerStack(stack2);
        stack2.pop();
        printIntegerStack(stack2);
        stack2.pop();
        printIntegerStack(stack2);


    }

    private static void printStack(Stack<String> stack) {
        if (stack.isEmpty()) {
            System.out.println("You have nothing in your stack");
        } else {
            System.out.printf("%s TOP, size: %s \n", stack, stack.size());
        }
    }

    private static void printIntegerStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("You have nothing in your stack");
        } else {
            System.out.printf("%s TOP, size: %s \n", stack, stack.size());
        }
    }
}
