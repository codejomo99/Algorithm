import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;


class Solution {
    public static void main(String args[]) throws Exception {


        Scanner sc = new Scanner(System.in);

        for (int t = 1; t <= 10; t++) {
            int n = sc.nextInt();

            Stack<Character> stack = new Stack<>();

            String s = sc.next();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '}') {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c == '>') {
                    if (!stack.isEmpty() && stack.peek() == '<') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }

            }

            if (stack.isEmpty()) {
                System.out.println("#" + t + " " + 1);
            } else {
                System.out.println("#" + t + " " + 0);
            }

        }


    }

}


