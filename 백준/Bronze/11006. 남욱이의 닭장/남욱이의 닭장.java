

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 0; t < T; t++){
      int n = sc.nextInt();
      int m = sc.nextInt();

      int a = n - m;
      int b = m - a;

      System.out.println(b+" "+a);
    }


  }
}
