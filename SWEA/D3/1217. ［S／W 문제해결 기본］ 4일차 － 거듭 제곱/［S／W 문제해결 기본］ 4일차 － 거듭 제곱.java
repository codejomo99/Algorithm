import java.util.Scanner;


public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



    for(int t = 1; t <= 10; t++){
      int T = sc.nextInt();
      int n = sc.nextInt();
      int m = sc.nextInt();

      int result = pow(n,m);



      System.out.println("#"+t+" "+result);

    }

    sc.close();
  }
  public static int pow(int n, int m) {
    if (m == 0) {
      return 1;
    }
    return n * pow(n, m - 1);  // 재귀 호출
  }

}
