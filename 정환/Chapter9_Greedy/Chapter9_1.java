package CodingTest_Study.정환.Chapter9_Greedy;

import java.util.*;

public class Chapter9_1 {
    static class status{
        int tall;
        int weight;

        status(int tall, int weight){
            this.tall = tall;
            this.weight = weight;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<status> list = new ArrayList<>();


        for(int i=0; i<n; i++){
            int tall = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new status(tall, weight));
        }
        int result = 0;

        Collections.sort(list, new Comparator<status>() {
            @Override
            public int compare(status o1, status o2) {
                return o2.tall-o1.tall;
            }
        });
        int max = Integer.MIN_VALUE;
        for(status s : list){
            if(s.weight > max){
                max = s.weight;
                result++;
            }
        }

        System.out.println(result);
    }
}
