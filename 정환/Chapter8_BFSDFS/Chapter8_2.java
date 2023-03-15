package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.Scanner;

public class Chapter8_2 {
    //시간초과나서 강의봄
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int n = sc.nextInt();

        int array[] = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        boolean[] check = new boolean[n];
        DFS(0,array, 0, c, n);
        System.out.println(result);
    }

    public static void DFS(int L, int[] array,  int sum, int c, int n){
        if(c < sum) {
            return;
        }
            if(L == n){
                result = Math.max(result, sum);
            }else {
                DFS(L+1, array, sum+array[L], c, n);
                DFS(L+1, array, sum, c, n);
            }
        }


}
