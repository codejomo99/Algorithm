import java.util.*;
import java.io.*;

public class Main {

  static char[] k, s;


  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    String King = sc.next();
    String Stone = sc.next();
    int times = sc.nextInt();

    k = King.toCharArray();
    s = Stone.toCharArray();

    for (int i = 0; i < times; i++) {
      String move = sc.next();

      checkQ(move);
    }

    System.out.print(k[0]);
    System.out.println(k[1]);
    System.out.print(s[0]);
    System.out.println(s[1]);

  }

  static void checkQ(String move) {
    char[] k_temp = k.clone();
    char[] s_temp = s.clone();

    switch (move) {
      case "R":
        k_temp[0] += 1;
        s_temp[0] += 1;
        break;

      case "L":
        k_temp[0] -= 1;
        s_temp[0] -= 1;
        break;

      case "B":
        k_temp[1] -= 1;
        s_temp[1] -= 1;
        break;

      case "T":
        k_temp[1] += 1;
        s_temp[1] += 1;
        break;

      case "RT":
        k_temp[0] += 1;
        s_temp[0] += 1;
        k_temp[1] += 1;
        s_temp[1] += 1;
        break;
      case "LT":
        k_temp[0] -= 1;
        s_temp[0] -= 1;
        k_temp[1] += 1;
        s_temp[1] += 1;
        break;

      case "RB":
        k_temp[0] += 1;
        s_temp[0] += 1;
        k_temp[1] -= 1;
        s_temp[1] -= 1;
        break;

      case "LB":
        k_temp[0] -= 1;
        s_temp[0] -= 1;
        k_temp[1] -= 1;
        s_temp[1] -= 1;
        break;

    }

    if(k_temp[0] >= 'A' && k_temp[0] <= 'H' && k_temp[1] >= '1' && k_temp[1] <= '8'){
      if(k_temp[0] == s[0] && k_temp[1] == s[1]){
        if(s_temp[0] >= 'A' && s_temp[0] <= 'H' && s_temp[1] >= '1' && s_temp[1] <= '8'){
          s = s_temp.clone();
          k = k_temp.clone();
        }
      }else{
        k = k_temp.clone();
      }
    }
  }
}
