import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    
    /* 
        1) 2칸 위로, 1칸 오른쪽
        2) 1칸 위로, 2칸 오른쪽
        3) 1칸 아래로, 2칸 오른쪽
        4) 2칸 아래로, 1칸 오른쪽 
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int result = 0;
        
        if(N==1){
            result = 1;
        }else if(N==2) {

            // 4방향 다 움직이지 못하니깐, 최대로 움직일 수 있는게 4.... 
            result = Math.min(4, (M + 1) / 2);
        }else if(N>=3){
            if(M < 7){
                result = Math.min(M,4);
            }else{
                result = M-2;
            }
        }

        System.out.println(result);

    }

}
