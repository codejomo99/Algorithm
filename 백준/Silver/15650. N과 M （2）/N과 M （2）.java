import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];


        dfs(1,0);
    }

    public static void dfs(int at, int depth){
        if(depth == M){
            for(int i : arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }else{
            for(int i = at; i <= N; i++){
                arr[depth] = i;
                dfs(i+1,depth+1);
            }

        }
    }

}