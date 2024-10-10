import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
  static ArrayList<Integer> list = new ArrayList<>();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){
      int n = sc.nextInt();

      list.clear();
      dfs(n);

      StringBuilder sb = new StringBuilder();

      for(int i = 0; i < list.size(); i++){
        sb.append(list.get(i));
      }

      String rs = new StringBuilder(sb).reverse().toString();

      for(int i = 0; i < rs.length(); i++){
        if(rs.charAt(i) == '1'){
          System.out.print(i+" ");
        }
      }
      System.out.println();

    }

  }

  public static void dfs(int n){
    if(n == 0){
      return;
    }else{
      dfs(n / 2);
      list.add(n%2);
    }
  }

}
