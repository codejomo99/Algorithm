import java.util.Scanner;
import java.util.Stack;


class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int t = 1; t <= T; t++) {

      double n = sc.nextInt();
      double d = sc.nextInt();

      double pos = d*2+1;

      int answer = (int) Math.ceil(n / pos);

      System.out.println("#"+t+" "+answer);


    }


  }
}
