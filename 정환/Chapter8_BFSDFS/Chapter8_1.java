package CodingTest_Study.정환.Chapter8_BFSDFS;

import java.util.Scanner;

public class Chapter8_1 {
    static boolean result = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n; i++)
            array[i] = sc.nextInt();

        boolean[] check = new boolean[n];
        DFS(array, n, check, 0);
        if(result == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }


    public static void DFS(int[] array, int n, boolean[] check, int one){
        if(one == another(check, array)){
            result = true;
        }else{
            for(int i=0; i<n; i++){
                if(!check[i]){
                    check[i] = true;
                    DFS(array, n, check, one+array[i]);
                    check[i] = false;
                }
            }
        }
    }

    public static int another(boolean[] check, int[] array){
        int sum = 0;
        for(int i=0; i< array.length; i++){
            if(!check[i]){
                sum += array[i];
            }
        }
        return sum;
    }
}
