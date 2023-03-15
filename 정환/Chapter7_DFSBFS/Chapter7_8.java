package CodingTest_Study.정환.Chapter7_DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chapter7_8 {
    static int result = 100000;
    static int[] jump = {1, -1, 5};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        dfs(e, s, 0);
        System.out.println(result);
    }

    public static void dfs(int e, int p, int count){

        boolean[] check = new boolean[10001];
        Queue<Integer> q = new LinkedList<>();
        q.add(p);
        check[p] = true;
        while(!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int cur = q.poll();
                if (cur == e) {
                    result = Math.min(result, count);
                }
                for (int j = 0; j < 3; j++) {
                    int nx = jump[j] + cur;
                    if (nx < 1 || nx > 10000) continue;
                    if (check[nx]) continue;
                    q.add(nx);
                    check[nx] = true;
                }
            }
            count++;
        }
    }
}
