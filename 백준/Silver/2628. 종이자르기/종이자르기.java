import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int width = sc.nextInt();
    int height = sc.nextInt();

    ArrayList<Integer> vertical = new ArrayList<>();
    ArrayList<Integer> horizon = new ArrayList<>();

    horizon.add(0);
    horizon.add(height);
    vertical.add(0);
    vertical.add(width);

    int n = sc.nextInt();

    for(int i = 0; i < n; i++){
      int num = sc.nextInt();

      if(num == 0){
        horizon.add(sc.nextInt());
      }else{
        vertical.add(sc.nextInt());
      }
    }

    Collections.sort(vertical);
    Collections.sort(horizon);

    int maxHeight = 0;
    for(int i = 1; i < horizon.size(); i++){
      maxHeight = Math.max(maxHeight, horizon.get(i) - horizon.get(i-1));
    }

    int maxWidth = 0;
    for(int i = 1; i < vertical.size(); i++){
      maxWidth = Math.max(maxWidth, vertical.get(i) - vertical.get(i-1));
    }

    System.out.println(maxHeight * maxWidth);






  }
}
