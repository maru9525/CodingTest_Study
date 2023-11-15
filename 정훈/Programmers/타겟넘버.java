package CodingTest_Study.정훈.Programmers;

class Solution_타겟넘버 {
    static int answer =0;
    public int solution(int[] numbers, int target) {

        //숫자 하나씩 해서 타겟 값을 구해야한다.
        //더하거나 빼서 타겟 넘버를 만들어야한다.
        dfs(numbers, 0, target, 0);
        return answer;
    }
    public static void dfs(int[] numbers, int depth, int target, int sum) {
        if(depth == numbers.length) {
            if(target == sum) answer++;
        }else{
            dfs(numbers, depth+1, target, sum + numbers[depth]);
            dfs(numbers, depth+1, target, sum - numbers[depth]);
        }
    }
}