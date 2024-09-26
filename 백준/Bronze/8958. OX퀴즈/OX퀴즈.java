import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 0; t < T; t++){
      String s = sc.next();

      int cnt = 0, sum = 0;
      for(char c : s.toCharArray()){
        if(c == 'X'){
          cnt = 0;
        }else{
          cnt++;
        }

        sum += cnt;
      }

      System.out.println(sum
      );

    }

    sc.close();
  }
}
