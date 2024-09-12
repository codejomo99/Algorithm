import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      int y = n - m;
      int x = m - y;

      System.out.printf("#%d %d %d\n",t,x,y);;


    }
  }



}

