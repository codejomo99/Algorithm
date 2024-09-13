import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Solution {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int t = 1; t <= 10; t++) {
      int n = sc.nextInt();

      char[][] arr= new char[8][8];

      // 배열 채우기
      for(int i = 0; i < 8; i++){
        String s = sc.next();
        for(int j = 0; j < 8; j++){
          arr[i][j] = s.charAt(j);
        }
      }

      boolean flag;
      int cnt = 0;

      //열 기준 탐색
      for(int i = 0; i < arr.length; i++){
        for(int j = 0; j <= arr.length - n; j++){
          StringBuilder sb = new StringBuilder();

          for(int k = j; k < j+n; k++){
            sb.append(arr[i][k]);
          }

          if(check(sb.toString())){
            cnt++;
          }
        }
      }


      //행 기준 탐색
      for(int j = 0; j < 8; j++){
        for(int i = 0; i <= 8-n; i++){
          StringBuilder sb = new StringBuilder();

          for(int k = i; k < i+n; k++){
            sb.append(arr[k][j]);
          }

          if(check(sb.toString())){
            cnt++;
          }
        }
      }

      System.out.println("#"+t+" "+cnt);

    }
  }

  public static boolean check(String s){
    String reverse = new StringBuilder(s).reverse().toString();

    if(reverse.equals(s)){
      return true;
    }

    return false;
  }


}
