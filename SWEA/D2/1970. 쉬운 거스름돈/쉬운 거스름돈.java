import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int t = 1; t <= T; t++) {
      int num = sc.nextInt();
      int[] count = new int[8];

      // 순서대로 처리
      count[0] = num / 50000;
      num %= 50000;

      count[1] = num / 10000;
      num %= 10000;

      count[2] = num / 5000;
      num %= 5000;

      count[3] = num / 1000;
      num %= 1000;

      count[4] = num / 500;
      num %= 500;

      count[5] = num / 100;
      num %= 100;

      count[6] = num / 50;
      num %= 50;

      count[7] = num / 10;
      num %= 10;

      // 결과 출력
      System.out.println("#" + t + " ");
      for (int i : count) {
        System.out.print(i + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}
