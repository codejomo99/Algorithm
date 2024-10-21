import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            String str = sc.next();

            Stack<Character> stack = new Stack<>();

            StringBuilder sb = new StringBuilder();

            char[] s = new char[str.length()];

            for (int i = 0; i < str.length(); i++) {
                s[i] = str.charAt(i);
            }

            Arrays.sort(s);

            for (int i = 0; i < str.length(); i++) {
                char c = s[i];
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            if (stack.isEmpty()) {
                System.out.println("#" + t + " " + "Good");
            } else {
                System.out.print("#" + t + " ");
                for (char c : stack) {
                    System.out.print(c);
                }
                System.out.println();
            }


        }

    }


}
