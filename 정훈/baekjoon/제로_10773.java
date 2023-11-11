package CodingTest_Study.정훈.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class 제로_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num == 0) stack.pop();
            else stack.push(num);

        }
        int result = 0;
        for(int r : stack) {
            result += r;
        }
//        if(!stack.isEmpty()) {
//            System.out.println(stack.peek());
//            result += stack.pop();
//        }
        System.out.println(result);
    }
}
