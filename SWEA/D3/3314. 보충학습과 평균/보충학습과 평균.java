import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int[] arr = new int[5];

      for(int i = 0; i < 5; i++){
        arr[i] = sc.nextInt();
      }

      int sum = 0;
      for(int i : arr){
        if(i < 40){
          i = 40;
        }
        sum+=i;
      }
      System.out.printf("#%d %d\n",t,sum/5);
    }
  }



}

