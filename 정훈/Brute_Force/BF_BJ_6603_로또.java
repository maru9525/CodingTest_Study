package CodingTest_Study.정훈.Brute_Force;

import java.util.Scanner;

public class BF_BJ_6603_로또 {
    static int[] arr;
    static boolean[] visited;
    static int[] result;
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            num = sc.nextInt();
            if(num == 0) break;

            arr = new int[num];
            visited = new boolean[num];
            result = new int[6];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            combi(0,0);

            System.out.println();
        }
    }

    private static void combi(int start, int depth) {
        if(depth == 6) {
            for (int i = 0; i < num; i++) {
                if(visited[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            return;
        }
        for (int i = start; i < num; i++) {
            if(!visited[i]) {
                visited[i] = true;
                combi(i + 1, depth + 1 );
                visited[i] = false;
            }
        }

    }
}
