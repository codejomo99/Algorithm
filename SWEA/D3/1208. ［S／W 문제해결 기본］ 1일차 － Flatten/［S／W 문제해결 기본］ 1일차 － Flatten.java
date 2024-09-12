import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Solution {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N,K;
    for (int t = 1; t <= 10; t++) {
      int n = sc.nextInt();

      int[] arr = new int[100];

      for(int i = 0; i < 100; i++){
        arr[i] = sc.nextInt();
      }

      for(int i = 0; i < n; i++){
        Arrays.sort(arr);
        arr[0]++;
        arr[arr.length-1]--;
      }
	
        Arrays.sort(arr);
        
      int answer = arr[arr.length-1] - arr[0];

      System.out.printf("#%d %d\n",t,answer);




    }
  }
}
