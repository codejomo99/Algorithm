import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();


    int k = sc.nextInt();

    int i = k / m;
    int j = k % m;

    System.out.println(i+" "+j);


  }
}
