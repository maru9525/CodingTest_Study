package CodingTest_Study.정훈.Programmers;

import java.util.Arrays;
class Solution_구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); //오름차순 정렬
        // for(int p : people) {
        //     System.out.println(p);
        // }
        int len = people.length;
        int index = 0;
        int cnt = 0;
        for(int i=len-1; i>=index; i--){
            if(people[i] + people[index] <= limit){
                cnt++;
                index++;
            }else{
                cnt++;
            }
        }


        return cnt;
    }
}
