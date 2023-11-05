package CodingTest_Study.정훈.Programmers;

class Solution_삼총사 {
    public int solution(int[] number) {
        int answer = 0;
        //3개를 합쳐서 0이 되는 경우 answer++
        //3중for문
        int len = number.length;
        for(int i=0; i<len-2; i++) {
            int sum = 0;
            for(int j=i+1; j<len-1; j++) {
                for(int k=j+1; k<len; k++) {
                    sum = number[i] + number[j] + number[k];
                    // System.out.println("check : " + sum);
                    if(sum == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}