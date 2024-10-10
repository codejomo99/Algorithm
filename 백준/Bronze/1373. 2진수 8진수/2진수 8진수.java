import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 2진수 입력
    String s = sc.next();
    
    // 8진수 변환
    String o = new BigInteger(s,2).toString(8);

    System.out.println(o);

    sc.close();
  }
}
