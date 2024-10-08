
import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int t = 0; t < T; t++){
      String s =  sc.next();

      Stack<Character> stack = new Stack<>();
      boolean isValid = true;
      
      for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);

        if(c == '('){
          stack.push(c);
        }else{
          if(stack.isEmpty() || stack.pop() != '('){
            isValid = false;
            break;
          }
        }
      }

      if(stack.isEmpty() && isValid){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }

    }
    sc.close();
  }

}
