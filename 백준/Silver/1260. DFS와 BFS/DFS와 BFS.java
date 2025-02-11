import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main{

    static int n,m,v;
    static int[][] board;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        board = new int[n+1][n+1];



        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            board[a][b] = board[b][a] = 1;
        }

        visit = new boolean[n+1];
        visit[v] = true;
        DFS(v);
        System.out.println();
        visit = new boolean[n+1];
        visit[v] = true;
        BFS(v);

    }

    public static void DFS(int L){
        System.out.print(L+" ");

        for(int i = 1; i <= n; i++){
            if(board[L][i] == 1 && !visit[i]){
                visit[i] = true;
                DFS(i);
            }
        }
    }

    public static void BFS(int L){
        Queue<Integer> q = new LinkedList<>();
        q.offer(L);

        while(!q.isEmpty()){
            int len = q.size();
            for(int i = 0; i < len; i++){
                int temp = q.poll();

                System.out.print(temp + " ");

                for(int j = 1; j <= n; j++){
                    if(board[temp][j] == 1 && !visit[j]){
                        visit[j] = true;
                        q.add(j);
                    }
                }
            }
        }
    }
}
