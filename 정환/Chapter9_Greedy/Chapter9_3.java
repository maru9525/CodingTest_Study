package CodingTest_Study.정환.Chapter9_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Chapter9_3 {
    //강의봤습니다.
    static class Time {
        int time;
        char state;
        Time(int time, char state){
            this.time = time;
            this.state = state;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int st = sc.nextInt();
            int et = sc.nextInt();
            list.add(new Time(st, 's'));
            list.add(new Time(et, 'e'));
        }

        Collections.sort(list, new Comparator<Time>(){
            public int compare(Time o1, Time o2) {
                if(o1.time == o2.time) return o1.state-o2.state;
                return o1.time - o2.time;
            }
        });

        int cnt = 0;
        int answer = 0;
        for(Time t : list){
            if(t.state == 's')cnt++;
            else cnt--;
            answer = Math.max(cnt, answer);

        }
        System.out.println(answer);

    }


}
