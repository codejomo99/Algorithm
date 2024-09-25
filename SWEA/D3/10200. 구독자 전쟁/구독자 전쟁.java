import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int t = 1; t <= T; t++) {

      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();

      int max = Math.min(A, B);
      
      int min = Math.max(0,A+B-N);

      System.out.printf("#%d %d %d\n",t,max,min);
    }
  }
}
