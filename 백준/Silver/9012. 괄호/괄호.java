
import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int t = 0; t < T; t++){
      String s =  sc.next();

      Stack<Character> stack = new Stack<>();

      for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);

        if(c == '('){
          stack.push(c);
        }else if(c == ')'){
          if(!stack.isEmpty() && stack.peek() == '('){
            stack.pop();
          }else if(stack.isEmpty()){
            stack.push(c);
          }
        }
      }

      if(stack.isEmpty()){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }

    }
    sc.close();
  }

}
