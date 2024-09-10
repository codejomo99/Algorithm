import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int t = 1; t <= T; t++) {
      String s = sc.next();

      String answer = "";

      for(char c : s.toCharArray()){
        if(c == 'b'){
          answer += 'd';
        }else if(c == 'd'){
          answer += 'b';
        }else if(c == 'p'){
          answer += 'q';
        }else if(c == 'q'){
          answer += 'p';
        }
      }

      String result = new StringBuilder(answer).reverse().toString();

      System.out.println("#"+t+" "+result);

    }


  }
}
