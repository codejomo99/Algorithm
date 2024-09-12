import java.math.BigInteger;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); // 테스트 케이스 수

    for (int t = 1; t <= T; t++) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      Integer[] arr = new Integer[n];

      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }

      Arrays.sort(arr,Collections.reverseOrder());

      int sum = 0;
      for(int i = 0; i < k; i++){
        sum += arr[i];
      }

      System.out.printf("#%d %d\n",t,sum);


    }
  }



}

