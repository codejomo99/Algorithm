import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;
    int[] arr = new int[5];
    for(int i = 0; i < 5; i++){
      arr[i] = sc.nextInt();
      sum+= arr[i];
    }

    int avg = sum / 5;
    Arrays.sort(arr);
    int mid = arr[2];
    System.out.println(avg);
    System.out.println(mid);



    sc.close();
  }
}
