import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[8];

    for(int i = 0; i < 8; i++){
      arr[i] = sc.nextInt();
    }

    boolean isAsc = true;
    for(int i = 0; i < 7; i++){
      if(arr[i] != i + 1){
        isAsc = false;
        break;
      }
    }

    boolean isDsc = true;
    for(int i = 0; i < 7; i++){
      if(arr[i] != 8 - i){
        isDsc = false;
        break;
      }
    }

    // 결과 출력
    if (isAsc) {
      System.out.println("ascending");
    } else if (isDsc) {
      System.out.println("descending");
    } else {
      System.out.println("mixed");
    }

    sc.close();
  }
}
