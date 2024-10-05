import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt(); // 가지고 있는 랜선
    int n = sc.nextInt(); // 필요한 랜선

    long[] length = new long[k];
    long maxLength = 0;

    for(int i = 0; i < k; i++){
      length[i] = sc.nextInt();
      if(length[i] > maxLength){
        maxLength = length[i]; // 최대 길이
      }
    }

    long low = 1; // 랜선 길이 최소
    long high = maxLength; // 랜선 길이 최대
    long result = 0; // 결과

    while(low <= high){
      long mid = (low + high ) / 2;

      long count = 0;
      for(int i = 0; i < k; i++){
        count += length[i] / mid; // 랜선을 잘라서 만들 수 있는 개수
      }

      // 필요한 랜선 개수
      if(count >= n){
        result = mid;
        low = mid+1;
      }else{
        high = mid - 1;
      }
    }
    System.out.println(result);
  }

}
