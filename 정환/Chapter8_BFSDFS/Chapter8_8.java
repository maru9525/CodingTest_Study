package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.Scanner;

public class Chapter8_8 {
    //강의를 보고 품
    static int[][] m = new int[35][35];
    static int n, f;
    static int[] p;
    static int[] b;
    static boolean[] check;
    static boolean flag = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        p = new int[n];
        b = new int[n];
        check = new boolean[n+1];

        for(int i=0; i<n; i++){
            b[i] = Combination(n-1, i);
        }
        dfs(0,0);

    }
    public static int Combination(int n, int r){
        if(m[n][r] > 0) return m[n][r];
        else if(n==r||r==0) {return m[n][r] = 1;}
        else return m[n][r] = Combination(n-1, r-1) +Combination(n-1, r);
    }
    static void dfs(int L, int sum){
        if(flag) return;
        if(L == n){
            if(sum == f){
                for(int x : p) System.out.print(x+ " ");
                flag = true;
            }
        }else{
            for(int i=1; i<=n; i++){
                if(!check[i]){
                    check[i] = true;
                    p[L] = i;
                    dfs(L+1, sum+(p[L]*b[L]));
                    check[i] = false;
                }
            }
        }
    }
}
