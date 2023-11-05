package CodingTest_Study.정훈.Programmers;

class Solution_자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        while(true) {
            if(n == 0 ) break;
            // System.out.println("n : " + n);
            int num = n % 10;
            // System.out.println("num : " + num);
            answer += num;
            n /= 10;
        }

        // System.out.print(temp);



        return answer;
    }
}