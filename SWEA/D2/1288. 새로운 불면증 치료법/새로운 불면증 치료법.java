
import java.util.HashSet;
import java.util.Scanner;


class Solution

{

  public static void main(String args[]) throws Exception
  {

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){

      int n = sc.nextInt();

      // 중복된 수를 거르기 위한 HashSet
      HashSet<Character> set = new HashSet<>();

      int s = 0;

      while(set.size() < 10){
        s++;
        int num = s * n;

        String numStr = String.valueOf(num);

        for(char c : numStr.toCharArray()){
          set.add(c);
        }
      }

      System.out.println("#"+t+" "+s*n);
    }





  }
}
