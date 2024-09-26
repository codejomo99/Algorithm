import java.util.*;

public class Solution {
    static Scanner sc;
    static int T, SIZE;
    static int[][] graph;
    static int[] visited;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        for (int test = 1; test <= 10; test++) {
            read();
            System.out.println("#" + T + " " + (dfss(0) == 1 ? 1 : 0));
        }

        sc.close(); // Scanner 객체를 닫습니다.
    }

    static void read() {
        T = sc.nextInt(); // 테스트 케이스 수
        SIZE = sc.nextInt(); // 그래프 크기

        graph = new int[SIZE][2];
        visited = new int[SIZE];

        // 입력받은 간선 정보를 그래프에 저장
        for (int i = 0; i < SIZE; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            if (graph[from][0] == 0) {
                graph[from][0] = to;
            } else {
                graph[from][1] = to;
            }
        }
    }

    static int dfss(int curr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(curr); // 현재 노드를 스택에 추가

        while (!stack.isEmpty()) {
            if (stack.peek() == 99) { // 목표 노드에 도달했는지 확인
                return 1;
            }

            int node = stack.pop(); // 스택에서 노드 제거

            if (visited[node] == 1) { // 이미 방문한 노드인 경우
                continue;
            } else {
                visited[node] = 1; // 방문 표시
            }

            // 현재 노드의 자식 노드가 존재하는 경우 스택에 추가
            if (graph[node][0] != 0) {
                stack.push(graph[node][0]);
            }
            if (graph[node][1] != 0) {
                stack.push(graph[node][1]);
            }
        }

        return 0; // 목표 노드에 도달하지 못한 경우
    }
}
