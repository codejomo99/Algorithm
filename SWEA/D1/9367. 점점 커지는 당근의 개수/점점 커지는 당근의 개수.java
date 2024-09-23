import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){

      int n = sc.nextInt();
      int[] arr = new int[n];

      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }

      int cnt = 1;

      int max = 1;

      for(int i = 0; i < n - 1; i++){
        if(arr[i] < arr[i+1]){

        cnt++;
          max = Math.max(max,cnt);

        }else{
          cnt = 1;
        }
      }

      System.out.println("#"+t+" "+max);



    }
    sc.close();
  }

}
