import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int t = 1; t <= T; t++) {

      int n = sc.nextInt();
      int m = sc.nextInt();


      int result = 1;
      for(int i = 0; i < m; i++){
        result = (result * n) % 10;
      }

      if (result == 0) {
        System.out.println("10");}
      else{
        System.out.println(result);
      }

   
    }


    sc.close();
  }
}
