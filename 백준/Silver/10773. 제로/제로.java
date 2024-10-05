
import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    Stack<Integer> stack = new Stack<>();

    for(int t = 0; t < T; t++){
      int n = sc.nextInt();

      if(n == 0){
        if(!stack.isEmpty()){
          stack.pop();
        }
      }else{
        stack.push(n);
      }
    }

    int sum = 0;
    for(int n : stack){
      sum += n;
    }

    System.out.println(sum);

    sc.close();
  }

}
