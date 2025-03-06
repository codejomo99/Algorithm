import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{

    static int N;
    static int[][] board, newBoard;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        board = new int[N][N];
        newBoard = new int[N][N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0);


        if(newBoard[N-1][N-1] == 1){
            System.out.println("HaruHaru");
        }else{
            System.out.println("Hing");
        }

    }

    public static void dfs(int x, int y){
        int[] dx = {0,1};
        int[] dy = {1,0};

        int num = board[x][y];
        newBoard[x][y] = 1;

        for(int i = 0; i < 2; i++){
            int nx = x + dx[i] * num;
            int ny = y + dy[i] * num;

            if(nx >= 0 && nx < N && ny >= 0 && ny < N && newBoard[nx][ny] == 0){
                dfs(nx,ny);
            }
        }


    }
}