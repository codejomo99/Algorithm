import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int Time = Integer.parseInt(st.nextToken());

    int result = Integer.MAX_VALUE;

    for(int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());
      int S = Integer.parseInt(st.nextToken());
      int I = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());


      int left = 0, right = C - 1;
      int BusTime = Integer.MAX_VALUE;

      while(left <= right){
        int mid =(left + right) / 2;

        int currentTime = S + I * mid;

        if(currentTime >= Time){
          BusTime = Math.min(BusTime,currentTime - Time);
          right--;
        }else{
          left++;
        }
      }
      result = Math.min(result,BusTime);
    }

    System.out.println(result == Integer.MAX_VALUE ? - 1 : result);
  }
}