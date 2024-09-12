import java.util.Scanner;
import java.util.Stack;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 테스트 케이스 10개 처리
    for (int t = 1; t <= 10; t++) {
      // 테스트 케이스 입력 (첫 번째는 길이, 두 번째는 번호 문자열)
      int N = sc.nextInt();
      String s = sc.next();

      // 스택을 사용하여 쌍 제거
      Stack<Character> stack = new Stack<>();


      for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);

        if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
          stack.pop();
        }else{
          stack.push(c);
        }
      }


      StringBuilder sb = new StringBuilder();
      for(char c : stack){
        sb.append(c);
      }

      System.out.printf("#%d %s\n",t,sb);

    }

    sc.close();
  }
}
