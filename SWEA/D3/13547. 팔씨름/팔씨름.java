import java.util.Scanner;
public class Solution {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int t = 1; t <= T; t++) {
      String s = sc.next();

      int lose = 0;
      for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == 'x'){
          lose++;
        }
      }

      String answer = "";

      if(lose <= 7){
        answer = "YES";
      }else{
        answer = "NO";
      }

      System.out.printf("#%d %s\n",t,answer);



    }
  }


}
