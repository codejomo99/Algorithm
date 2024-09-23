import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수

    for(int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      String s = sc.next();

      int count = 0;
      int max = Integer.MIN_VALUE;

      for(int i = 0; i < s.length(); i++){

        if(s.charAt(i) == '1'){
          count++;
          max = Math.max(max,count);
        }else{
          count = 0;
        }

      }

      System.out.println("#"+t+" "+max);





    }
    sc.close();
  }

}
