import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();

    for(int i = 0; i < n; i++){
      String s = sc.nextLine();

      String a = s.substring(0,1).toUpperCase() + s.substring(1);

      System.out.println(a);





    }
  }

}
