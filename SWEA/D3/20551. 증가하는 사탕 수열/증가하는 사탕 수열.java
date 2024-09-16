import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수
    for (int t = 1; t <= T; t++) {
      int result = 0;

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if(b >= 2 && c >= 3){
        if(b >= c){
          result += b - c + 1;
          b = c - 1;
        }

        if(a >= b){
          result += a - b + 1;
          a = b - 1;
        }
      }else{
        result = -1;
      }



      System.out.println("#"+t+" "+result);
    }

    sc.close();
  }
}
