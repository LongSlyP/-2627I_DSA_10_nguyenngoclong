import java.util.*;

public class Bai3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int type = sc.nextInt();

            // Query 1: Enqueue
            if (type == 1) {

                int x = sc.nextInt();
                stack1.push(x);

            }

            // Query 2: Dequeue
            else if (type == 2) {

                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }

                stack2.pop();
            }

            // Query 3: Print front
            else if (type == 3) {

                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }

                System.out.println(stack2.peek());
            }
        }

        sc.close();
    }
}