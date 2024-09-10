import java.util.Scanner;

class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int TC = sc.nextInt();

    for (int t = 1; t <= TC; t++) {
      int A = sc.nextInt();
      int B = sc.nextInt();

      int count = 0;

      for (int i = A; i <= B; i++) {
        int sqrt = (int) Math.sqrt(i);
        if (sqrt*sqrt == i && isPal(i) && isPal(sqrt)) {
          count++;
        }
      }
      System.out.println("#"+t+" "+count);
    }
  }

  // 팰린드롬 검사 메서드
  static boolean isPal(int n) {
    String s = String.valueOf(n);
    String reverse = new StringBuilder(s).reverse().toString();
    return s.equals(reverse);
  }
}
