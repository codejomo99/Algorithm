import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      String memory = sc.next();

      int count = 0;
      char pre = '0';

      for(int i = 0; i < memory.length(); i++){
        if(memory.charAt(i) != pre){
          count++;
          pre = memory.charAt(i);
        }
      }

      System.out.printf("#%d %d\n",t,count);
    }
  }



}

