import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    int[] div = {2,3,5,7,11}; //소인수들

    for(int t = 1; t <= T; t++){
      int N = sc.nextInt();
      int[] counts = new int[5];

      for(int i = 0; i < div.length; i++){
        while(N % div[i] == 0){
          counts[i]++;
          N /= div[i];
        }
      }

      System.out.print("#"+t+" ");
      for(int i : counts){
        System.out.print(i+" ");
      }
      System.out.println();


    }
  }
}
