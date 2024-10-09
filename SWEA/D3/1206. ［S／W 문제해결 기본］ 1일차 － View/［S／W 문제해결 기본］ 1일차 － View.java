
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
  static int[] arr;
  public static void main(String args[]) throws Exception

  {


    Scanner sc = new Scanner(System.in);

    for(int test_case = 1; test_case <= 10; test_case++)
    {
      int n = sc.nextInt();
      arr = new int[n];

      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }

      int sum = 0;

      for(int i = 2; i < n - 2; i++){
        sum += Building(i);
      }

      System.out.println("#"+test_case+" "+sum);

    }
  }

  public static int Building(int idx){

    // 현재 빌딩
    int b = arr[idx];


    // 현재 빌딩 제외 하고 가장 큰 빌딩
    int h = Integer.MIN_VALUE;

    for(int i = idx -2; i <= idx + 2; i++){
      if(i != idx){
        h = Math.max(h,arr[i]);
      }
    }

    if(b > h){
      return b - h;
    }else{
      return 0;
    }

  }
}
