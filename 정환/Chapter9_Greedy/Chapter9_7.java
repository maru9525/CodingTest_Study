package CodingTest_Study.정환.Chapter9_Greedy;

import java.util.*;

public class Chapter9_7 {
//강의
    static class city implements Comparable<city> {
        int node;
        int value;
        city(int node, int value){
            this.node = node;
            this.value = value;
        }
        @Override
        public int compareTo(city ob){
            return this.value-ob.value;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();
        ArrayList<ArrayList<city>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        int[] ch = new int[n+1];
        for(int i=0; i<v; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new city(b,c));
            graph.get(b).add(new city(a,c));
        }
        int answer = 0;
        PriorityQueue<city> pq = new PriorityQueue<>();
        pq.offer(new city(1, 0));
        while (!pq.isEmpty()){
            city tmp = pq.poll();
            int en = tmp.node;
            if(ch[en]==0){
                ch[en] = 1;
                answer += tmp.value;
                for(city ob : graph.get(en)){
                    if(ch[ob.node]==0) pq.offer(new city(ob.node, ob.value));
                }
            }
        }
        System.out.println(answer);

    }



}
