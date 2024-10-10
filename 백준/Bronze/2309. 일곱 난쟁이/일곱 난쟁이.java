import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  static int[] arr,ch;
  static boolean flag =false;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    arr = new int[9];
    ch = new int[7];

    for(int i = 0; i < 9; i++){
      arr[i] = sc.nextInt();
    }

    dfs(0,0,0);

  }

  public static void dfs(int idx, int L, int sum){

    if(flag){
      return;
    }


    if(L == 7){
      if(sum == 100){
        flag = true;
        Arrays.sort(ch);
        for(int x : ch){
          System.out.println(x);
        }
      }

    }else{

      if(idx >= 9) return;


      ch[L] = arr[idx]; // 현재 idx 의 난쟁이 선택
      dfs(idx+1,L+1,sum+arr[idx]);
      dfs(idx+1,L,sum);
    }
  }
}
