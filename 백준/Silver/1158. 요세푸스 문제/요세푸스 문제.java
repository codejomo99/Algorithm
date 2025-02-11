import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            q.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();

        int cnt = 0;
        while(!q.isEmpty()){
            cnt++;

            if(cnt == k){
                cnt = 0;
                list.add(q.poll());
            }else{
                q.add(q.poll());
            }
        }

        System.out.print("<");
        for(int i = 0; i < list.size(); i++) {
            if(i == list.size() -1) {
                System.out.print(list.get(i)+">");
            }else {
                System.out.print(list.get(i)+", ");
            }


        }
        

    }
}
