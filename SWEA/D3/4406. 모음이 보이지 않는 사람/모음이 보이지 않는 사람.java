import java.math.BigInteger;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      String s = sc.next();
      char[] arr = {'a','e','i','o','u'};

      StringBuilder sb = new StringBuilder();

      for(char c : s.toCharArray()){
        boolean flag = true;
        for(int i = 0; i < arr.length; i++){
          if(c == arr[i]){
            flag = false;
          }
        }

        if(flag){
          sb.append(c);
        }
      }

      System.out.println("#"+t+" "+sb);
    }
  }



}

