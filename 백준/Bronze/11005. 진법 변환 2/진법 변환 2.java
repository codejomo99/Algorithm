import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int tmp = 0;

    String result = "";
    while(n > 0){
      tmp = n % m;
      if(tmp >= 10){
        char c = (char) ( tmp + 55);
        result += c;
      }else{
        result += tmp;
      }
      n = n / m;
    }

    for(int i = result.length() - 1; i >= 0; i --){
      System.out.print(result.charAt(i));
    }
  }

}


