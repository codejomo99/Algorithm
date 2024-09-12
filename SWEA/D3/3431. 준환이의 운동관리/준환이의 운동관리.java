import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int L = sc.nextInt();
      int U = sc.nextInt();
      int X = sc.nextInt();

      int answer = 0;
      if(X < L){
        answer = L - X;
      }else if(X > U){
        answer = -1;
      }

      System.out.printf("#%d %d\n",t,answer);
      
    }
  }



}

