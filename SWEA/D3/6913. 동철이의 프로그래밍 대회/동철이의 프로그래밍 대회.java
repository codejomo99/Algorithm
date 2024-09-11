
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();

    for (int t = 1; t <= test; t++) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] ex = new int[m];

      int max = Integer.MIN_VALUE;
      int answer = 0;
      ArrayList<Integer> list = new ArrayList<>();

      // 사람의 수 반복
      for(int i = 0; i < n; i++){
        int success = 0;
        // 입력 받는거 반복
        for(int j = 0; j < m; j++) {
          ex[j] = sc.nextInt();
          if(ex[j] == 1){
            success++;
          }
        }
        list.add(success);
        max = Math.max(max,success);
      }

      for(int i : list){
        if(max == i){
          answer++;
        }
      }



      System.out.println("#"+t+" "+answer+" "+max);
    }
  }
}
