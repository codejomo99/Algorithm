import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        // 우선순위 큐로 스택의 맨 위 값을 관리
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        Stack<Integer>[] stacks = new Stack[M];
        
        for (int i = 0; i < M; i++) {
            int k = Integer.parseInt(br.readLine());
            stacks[i] = new Stack<>();
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                stacks[i].push(Integer.parseInt(st.nextToken()));
            }
            
            // 각 스택의 맨 위 값을 우선순위 큐에 추가 (값, 스택 인덱스)
            pq.offer(new int[] { stacks[i].peek(), i });
        }
        
        int nextExpected = 1; // 꺼내야 할 다음 번호
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll(); // 가장 작은 번호와 해당 스택 정보
            int topValue = current[0];
            int stackIndex = current[1];
            
            // 번호가 일치하면 꺼냄
            if (topValue == nextExpected) {
                nextExpected++;
                stacks[stackIndex].pop();
                
                // 해당 스택에 값이 남아 있다면 다음 맨 위 값을 우선순위 큐에 삽입
                if (!stacks[stackIndex].isEmpty()) {
                    pq.offer(new int[] { stacks[stackIndex].peek(), stackIndex });
                }
            } else {
                // 번호가 일치하지 않으면 불가능
                System.out.println("No");
                return;
            }
        }
        
        // 모든 교과서를 순서대로 꺼낼 수 있음
        System.out.println("Yes");
    }
}