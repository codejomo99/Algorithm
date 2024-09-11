import java.math.BigInteger;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      String s = sc.next();

      char c = s.charAt(s.length()-1);
      int n = c - '0';

      String answer = n % 2 == 0 ? "Even" : "Odd";

      System.out.printf("#%d %s\n",t,answer);
    }
  }


}

