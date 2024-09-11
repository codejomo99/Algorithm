import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      // 올라갈때
      int maxUp = 0;
      // 내려갈때
      int maxDown = 0;

      for(int i = 0; i < n - 1; i++){
        int diff = arr[i+1] - arr[i];
        if(diff > 0){
          maxUp = Math.max(maxUp,diff);
        }else{
          maxDown = Math.min(maxDown,diff);
        }
      }

      System.out.printf("#%d %d %d\n", t, maxUp, Math.abs(maxDown));

    }
  }


}

