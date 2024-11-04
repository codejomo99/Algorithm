import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        List<Integer> list = new ArrayList<>();

        while(!q.isEmpty()){
            for(int i = 0; i < k-1; i++){
                q.add(q.poll());
            }
            list.add(q.poll());
        }

        System.out.print("<");
        for(int i = 0; i < list.size(); i++){
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print(">");



    }
}
