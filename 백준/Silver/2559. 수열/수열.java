import java.util.*;
import java.io.*;

public class Main {


  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] arr = new int[n];

    arr[0] = sc.nextInt();

    for(int i = 1; i < n; i++){
      arr[i] = arr[i-1] + sc.nextInt();
    }

    int max = arr[m - 1];
    for(int i = m; i < n; i++){
      max = Math.max(arr[i] - arr[i-m], max);
    }

    System.out.println(max);

  }
}
