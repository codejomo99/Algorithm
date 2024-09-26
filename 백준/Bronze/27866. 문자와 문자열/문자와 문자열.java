import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int n = sc.nextInt();
    
    char c = s.charAt(n-1);

    System.out.println(c);

    sc.close();
  }
}
