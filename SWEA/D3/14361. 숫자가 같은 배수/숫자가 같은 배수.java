import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt(); // 테스트 케이스의 수
    for (int t = 1; t <= T; t++) {
      long n = sc.nextLong();

      if(isPossible(n)){
        System.out.println("#"+ t+" possible");
      }else{
        System.out.println("#"+t+" impossible");
      }

    }

    sc.close();
  }

  public static boolean isPossible(long n){
    String sort = sortN(n);
    for(int k =2; k <= 10; k++){
      long kn = k * n;
      if(sortN(kn).equals(sort)){
        return true;
      }
    }
    return false;
  }

  public static String sortN(long n){
    char[] numbers = Long.toString(n).toCharArray();
    Arrays.sort(numbers);
    return new String(numbers);
  }

}
