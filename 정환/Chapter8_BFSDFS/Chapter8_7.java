package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.Scanner;

public class Chapter8_7 {
    static int[][] m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        m = new int[n+1][r+1];
        Combination(n, r);

        System.out.println(m[n][r]);
    }

    public static int Combination(int n, int r){
        if(m[n][r] != 0) return m[n][r];
        if(r==0) return m[n][r] = 0;
        else if(n==1&&r==1) {return m[n][r] = 1;}
        else if(n>1&&r==1) {
            return m[n][r] = n;}
        else if(n>1&&r>1) {
            return m[n][r] = Combination(n-1, r-1) +Combination(n-1, r);
        }
        else return 0;
    }
}
