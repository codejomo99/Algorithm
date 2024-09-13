import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Solution {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int t = 1; t <= 10; t++) {
      
      int tmp = sc.nextInt();
      int cnt = 0;
      
      // 찾는 문자
      String s = sc.next();
      
      // 문자열
      String b = sc.next();
      
      for(int i = 0; i <= b.length() - s.length(); i++){
        String c = b.substring(i, i + s.length());
        if(c.equals(s)){
          cnt++;
        }
      }

      System.out.println("#"+t+" "+cnt);

    }
  }


}
