import java.util.*;
import java.io.*;

public class Main {
    static class Node implements Comparable<Node> {
        int vertex, dist;

        Node(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node other) {
            return this.dist - other.dist;
        }
    }

    static final int INF = Integer.MAX_VALUE;
    static int n, e;
    static List<Node>[] graph;

    public static int[] dijkstra(int start) {
        int[] distances = new int[n + 1];
        Arrays.fill(distances, INF);
        distances[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            int currVertex = now.vertex;
            int currDist = now.dist;

            if (currDist > distances[currVertex]) continue;

            for (Node neighbor : graph[currVertex]) {
                int next = neighbor.vertex;
                int cost = currDist + neighbor.dist;
                if (cost < distances[next]) {
                    distances[next] = cost;
                    pq.add(new Node(next, cost));
                }
            }
        }

        return distances;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a].add(new Node(b, c));
            graph[b].add(new Node(a, c));
        }

        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        int[] distFromStart = dijkstra(1);
        int[] distFromV1 = dijkstra(v1);
        int[] distFromV2 = dijkstra(v2);

        // 경로 1: 1 -> v1 -> v2 -> n
        long path1 = (long) distFromStart[v1] + distFromV1[v2] + distFromV2[n];

        // 경로 2: 1 -> v2 -> v1 -> n
        long path2 = (long) distFromStart[v2] + distFromV2[v1] + distFromV1[n];

        long result = Math.min(path1, path2);
        System.out.println(result >= INF ? -1 : result);
    }
}