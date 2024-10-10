import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for(int t = 1; t <= T; t++){
      int n = sc.nextInt();
      int[] arr = new int[n];

      int total = 0;
      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
        total += arr[i];
      }

      int avg = total / n;

      int count = 0;
      for(int i : arr){
        if(avg < i){
          count++;
        }
      }

      double result = (double) (count * 100) / n;

      System.out.println(String.format("%.3f",result)+"%");




    }
  }

}


