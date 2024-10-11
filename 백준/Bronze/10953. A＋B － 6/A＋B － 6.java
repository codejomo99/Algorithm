

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for(int t = 1; t <= T; t++){
      String s = sc.next();
      String[] arr = s.split(",");
      
      int result = 0;
      for(String st : arr){
        int n = Integer.parseInt(st);
        result+= n;
      }

      System.out.println(result);
      
    }


  }
}
