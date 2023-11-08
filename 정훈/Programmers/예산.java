package CodingTest_Study.정훈.Programmers;

import java.util.*;
class Solution_예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        //d : 부서별 신청 금액
        //budget : 금액
        //최대 물품 지원 수
        Arrays.sort(d);
        for(int i=0; i<d.length; i++) {

            budget -= d[i];
            if(budget < 0 ) break;

            answer++;
        }

        return answer;
    }
}