import java.util.Scanner;

public class Main {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n+1];

    for(int i = 1; i <=n ; i++){
      arr[i] = sc.nextInt();
    }


    int s = sc.nextInt();
    for(int i = 0; i < s; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();

      if(a == 1){
        for(int j = b; j <= n; j+=b){
          arr[j] = (arr[j] == 1) ? 0 : 1;
        }
      }else{

        int lt = b, rt = b;

        while(lt > 1 && rt < n && arr[lt-1] == arr[rt+1]){
          lt--;
          rt++;
        }

        for (int j = lt; j <= rt; j++) {
          arr[j] = (arr[j] == 1) ? 0 : 1;
        }
      }
    }

    for(int i = 1; i <= n; i++){
      System.out.print(arr[i]+" ");
      if (i % 20 == 0) {
        System.out.println();
      }
    }

  }
}
