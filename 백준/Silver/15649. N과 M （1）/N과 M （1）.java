import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

    static int N, M;
    static int[] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        dfs(0);
    }

    public static void dfs(int depth){
        if(depth == M){
            for(int i : arr){
                System.out.print(i +" ");
            }
            System.out.println();
            return;
        }else{
            for(int i = 0; i < N; i++){
                if(!visit[i]){
                    visit[i] = true;
                    arr[depth] = i+1;
                    dfs(depth+1);
                    visit[i] = false;
                }
            }
        }
    }
}