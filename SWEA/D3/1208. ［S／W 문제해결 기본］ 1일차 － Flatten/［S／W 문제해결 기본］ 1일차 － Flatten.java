import java.util.*;

class Solution {


  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (int t = 1; t <= 10; t++) {
      int n = sc.nextInt();

      int[] arr = new int[100];
      for (int i = 0; i < 100; i++) {
        arr[i] = sc.nextInt();
      }

      // n번 반복
      for (int i = 0; i < n; i++) {

        int maxIdx = 0;
        int minIdx = 0;

        // 가장 크고 작은 idx 구하기
        for (int j = 0; j < 100; j++) {
          if (arr[j] > arr[maxIdx]) {
            maxIdx = j;
          } else if (arr[j] < arr[minIdx]) {
            minIdx = j;
          }
        }

        // 낮추고 더하기
        arr[maxIdx]--;
        arr[minIdx]++;

      }

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for (int i : arr) {
        max = Math.max(max, i);
        min = Math.min(min, i);
      }

      System.out.println("#" +t+" "+(max-min));

    }


  }


}
