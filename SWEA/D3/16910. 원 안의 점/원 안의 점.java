import java.util.Scanner;


class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){

      int N = sc.nextInt();

      int result = 0;

      for(int x = -N; x <= N; x++){
        for(int y = -N; y <= N; y++){
          if((x*x + y*y) <= N * N){
            result++;
          }
        }
      }


      System.out.println("#"+t+" "+result);



    }


  }
}
