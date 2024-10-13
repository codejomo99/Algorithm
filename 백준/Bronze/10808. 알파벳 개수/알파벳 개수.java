import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] ch = new int[26];



    String s = sc.next();

    for(char c : s.toCharArray()){
      int n = c - 97;
      ch[n]++;
    }

    for(int i : ch){
      System.out.print(i+" ");
    }




  }

}
