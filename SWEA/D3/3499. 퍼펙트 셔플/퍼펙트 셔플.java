import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      String[] s = new String[n];

      for(int i = 0; i < n; i++){
        s[i] = sc.next();
      }

      String[] result = new String[n];
      
      int j = 0;
      for(int i = 0; i < n; i+=2){
        result[i] = s[j++];
      }
      for(int i = 1; i < n; i+=2){
        result[i] = s[j++];
      }

      System.out.print("#"+t+" ");
      for(String r : result){
        System.out.print(r+" ");
      }
      System.out.println();
    }
  }
}
