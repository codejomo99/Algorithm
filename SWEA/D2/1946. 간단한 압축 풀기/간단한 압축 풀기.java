import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 1; t <= T; t++) {
      int n = sc.nextInt();

      StringBuilder sb = new StringBuilder();

      for(int i = 0; i < n; i++){
        char c = sc.next().charAt(0);
        int count = sc.nextInt();

        for(int j = 0; j < count; j++){
          sb.append(c);
        }
      }

      System.out.println("#"+t);
      for(int i = 0; i < sb.length(); i+=10){
        if(i+10 < sb.length()){
          System.out.println(sb.substring(i,i+10));
        }else{
          System.out.println(sb.substring(i));
        }
      }


    }
  }
}
