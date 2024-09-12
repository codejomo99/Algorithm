import java.math.BigInteger;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();

      int answer = C / Math.min(A,B);

      System.out.printf("#%d %d\n",t,answer);

    }
  }



}

