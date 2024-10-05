import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }

    Stack<Integer> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();

    int current = 1; // 현재 push
    boolean possible = true;

    for(int i = 0; i < n; i++){
      int target = arr[i]; // 현재 수열에 넣는 수

      // 필요한 수가 나올때까지 push
      while(current <= target){
        stack.push(current);
        sb.append("+\n");
        current++;
      }

      // 스택의 top이 필요한 수와 같으면 pop
      if(!stack.isEmpty() && stack.peek() == target){
        stack.pop();
        sb.append("-\n");
      }else{
        possible = false;
        break;
      }

    }
    if(possible){
      System.out.println(sb);
    }else{
      System.out.println("NO");
    }


  }

}
