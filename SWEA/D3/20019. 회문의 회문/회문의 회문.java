import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수
    for (int t = 1; t <= T; t++) {
      String s = sc.next();

      int f = (s.length() - 1) / 2;
      int e = (s.length() - 1) / 2;

      boolean flag = false;



      if(pail(s)){
        String rs = s.substring(0,f);
        String es = s.substring(s.length()-e);

        if(pail(rs) && pail(es)){
          flag = true;
        }

      }

      String result = "";
      if(flag) result = "YES";
      else result = "NO";

      System.out.println("#"+t+" "+result);
    }

    sc.close();
  }

  public static boolean pail(String s){
    String reverse = new StringBuilder(s).reverse().toString();

    if(reverse.equals(s)){
      return true;
    }
    return false;
  }
}
