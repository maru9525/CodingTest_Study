package CodingTest_Study.정환.Chapter9_Greedy;

import java.util.*;

public class Chapter9_4 {
    static class lecture {
        int money;
        int day;
        lecture(int money, int day){
            this.money = money;
            this.day = day;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<lecture> list = new ArrayList<>();
        for(int i = 0;  i<n; i++){
            list.add(new lecture(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(list, new Comparator<lecture>() {
            @Override
            public int compare(lecture o1, lecture o2) {
                return o2.day-o1.day;
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        int start = list.get(0).day;
        int j = 0;
        for(int i = start; i>=1; i-- ){
            for(; j<n; j++){
                if(list.get(j).day<i) break;
                pq.offer(list.get(j).money);
            }
            if(!pq.isEmpty()) answer+=pq.poll();
        }

        System.out.println(answer);
    }
}
