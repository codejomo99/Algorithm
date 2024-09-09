import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      int result = 0;
      boolean check = false;
      Set<String> set = new HashSet<>();

      for (int i = 0; i < n; i++) {
        String str = sc.next();

        if (set.contains(str)) {
          result += m * 2;
        } else {
          if (!check && pal(str)) {
            check = true;
            result += m;
          } else {
            StringBuilder sb = new StringBuilder(str);
            set.add(sb.reverse().toString());
          }
        }
      }

      System.out.println("#" + t + " " + result);
    }

    sc.close();
  }

  static boolean pal(String str) {
    for (int i = 0; i < str.length()/2; i++) {
      if (str.charAt(i) != str.charAt(str.length()-1 -i)){
        return false;
      }
    }
    return true;
  }
}
