import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int[] arr = new int[26];

    for(int i = 0; i < 26; i++){
      arr[i] = -1;
    }

    for(int i = 0; i < s.length(); i++){
      char c = s.charAt(i);
      int idx = c - 'a';

      if(arr[idx] == -1){
        arr[idx] = i;
      }
      
    }

    for (int i = 0; i < 26; i++) {
      System.out.print(arr[i] + " ");
    }
    
    

    sc.close();
  }
}
