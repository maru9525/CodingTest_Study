package CodingTest_Study.정훈.Programmers;

class Solution_할일목록 {
    public String[] solution(String[] todo_list, boolean[] finished) {

        // StringBuilder sb = new StringBuilder();
        int num = 0;
        //false인 경우의 i 값을 answer에 담아주면 됨
        for(int i=0; i<todo_list.length; i++) {
            if(!finished[i]) {
                num++;
            }
        }
        String[] answer = new String[num];
        int j = 0;
        for(int i=0; i<todo_list.length; i++) {
            if(!finished[i]) {
                answer[j++] = todo_list[i];
            }
        }
        // System.out.print(sb.toString());

        return answer;
    }
}