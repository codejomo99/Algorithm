import java.util.Scanner;

class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int TC = sc.nextInt();

    for (int t = 1; t <= TC; t++) {
      int n = sc.nextInt();

      int time = n * 2;

      int hour = time / 60;
      int min = time % 60;

      System.out.println("#"+t+" "+hour+" "+min);


    }
  }

}
