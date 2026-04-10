import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack); // [10, 20, 30]

        System.out.println(stack.pop()); // 30

        System.out.println(stack.peek()); // 20

        System.out.println(stack.empty()); // false
    }
}