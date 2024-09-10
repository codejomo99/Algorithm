import java.util.Scanner;
import java.util.Stack;


class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int t = 1; t <= T; t++) {

      String s = sc.next();

      Stack<Character> stack = new Stack<>();

      int answer = 0;

      for (char c : s.toCharArray()) {
        if (c == '(') {
          stack.push(c);
        } else if (c == '|') {
          if (!stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
            answer++;
          } else {
            stack.push(c);
          }
        } else if ( c == ')'){
          if(!stack.isEmpty() && stack.peek() == '('){
            stack.pop();
            answer++;
          }else if(!stack.isEmpty() && stack.peek() == '|'){
            stack.pop();
            answer++;
          }else{
            stack.push(c);
          }
        }
      }

      System.out.println("#" + t + " " + answer);


    }


  }
}
