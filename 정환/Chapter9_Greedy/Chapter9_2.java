package CodingTest_Study.정환.Chapter9_Greedy;
import java.util.*;

public class Chapter9_2 {

    static class Time{

        public int s;
        public int e;

        Time(int s, int e){
            this.s = s;
            this.e = e;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new Time(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(list, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if(o2.e == o1.e){
                    return o1.s-o2.s;
                }
                else return o1.e-o2.e;
            }
        });
        int start = list.get(0).e;
        int count = 1;
        for(int i=0; i<n; i++){
            if(start <= list.get(i).s){
                count++;
                start = list.get(i).e;
            }

        }
        System.out.println(count);
    }
}
