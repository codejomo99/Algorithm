import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();

      double avg = 0.0;

      for(int i = 0; i < n; i++){
        double p = sc.nextDouble();
        int s = sc.nextInt();
        avg += p * s;
      }

      System.out.printf("#%d %.6f\n", t, avg);
    }
  }


}

