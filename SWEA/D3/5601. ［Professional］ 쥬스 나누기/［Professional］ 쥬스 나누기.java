import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int t = 1; t <= T; t++) {
      int N = sc.nextInt();

      System.out.print("#"+t+" ");
      for(int i = 0; i < N; i++){
        System.out.print("1/"+N+" ");
      }
      System.out.println();

    }
  }
}
