package CodingTest_Study.정훈.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_GP_1260_DFS와BFS {
    static int n,m,v;
    static int[][] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        graph = new int[1001][1001];
        visited = new boolean[1001];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph[v1][v2] = graph[v2][v1] = 1;
        }

        dfs(v);

        sb.append("\n");
        visited = new boolean[1001]; //방문 초기화
        bfs(v);
        System.out.println(sb);
    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;
        sb.append(v + " ");
        while(!q.isEmpty()) {
            int temp = q.poll();
            for (int i = 1; i <= n; i++) {
                if(graph[temp][i] == 1 && visited[i] == false){
                    q.offer(i);
                    visited[i] = true;
                    sb.append(i + " ");
                }
            }

        }
    }

    private static void dfs(int v) {
        visited[v] = true;
        sb.append(v).append(" ");

        for (int i = 1; i <= n; i++) {
            if(graph[v][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }

}
