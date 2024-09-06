
import java.util.HashSet;
import java.util.Scanner;


class Solution

{
  
  public static void main(String args[]) throws Exception
  {

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){
      int P = sc.nextInt();
      int Q = sc.nextInt();
      int R = sc.nextInt();
      int S = sc.nextInt();
      int W = sc.nextInt();
      int A = 0, B = 0;


      A = W * P;
      B = W <= R ? Q : (W - R) * S + Q;


      System.out.println("#"+t+" "+ (A > B ? B : A));

    }




  }
}
