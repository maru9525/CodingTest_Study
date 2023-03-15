package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Chapter8_5 {
    //타임아웃나서 강의에서 정렬하라는거 보게됐어요
    static int result = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] coins = new Integer[n];
        for(int i=0; i<n; i++){
            coins[i] = sc.nextInt();
        }
        Arrays.sort(coins, Collections.reverseOrder());
        int m = sc.nextInt();
        boolean[] check = new boolean[n];
        dfs(coins, check, 0, m);
        System.out.println(result);
    }

    public static void dfs(Integer[] coins,boolean[] check, int count, int m){
        if(m < 0){
            return;
        }
        if(count > result) return;
            if(m == 0){
                result = Math.min(count, result);
                return;
            }
            else{
                for(int i=0; i<coins.length; i++){
                        dfs(coins, check, count+1, m-coins[i]);
                }
            }

    }
}
