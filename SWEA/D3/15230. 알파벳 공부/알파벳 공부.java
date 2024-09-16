import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수
    for (int t = 1; t <= T; t++) {
      char[] c = new char[26];

      for(int i = 0; i < 26; i++){
        c[i] = (char) ('a' + i);
      }

      String s = sc.next();

      int cnt = 0;
      for(int i = 0; i < s.length(); i++){
        if(c[i] == s.charAt(i)){
          cnt++;
        }else{
          break;
        }
      }

      System.out.println("#"+t+" "+cnt);

    }

    sc.close();
  }




}
