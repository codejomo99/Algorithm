import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){
      int n = sc.nextInt();


      String s = String.valueOf(n);
      Set<Character> set = new HashSet<>();

      for(char c : s.toCharArray()){
        set.add(c);
      }

      System.out.println("#"+t+" "+set.size());
    }

    sc.close();
  }


}
