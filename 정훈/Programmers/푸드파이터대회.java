package CodingTest_Study.정훈.Programmers;

class Solution_푸드파이터대회 {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();


        for(int i=1; i<food.length; i++) {
            int n = food[i]/2;
            System.out.print(n);
            for(int j=0; j<n; j++) {
                sb.append(i);
            }


        }
        sb.append("0");
        for(int i=food.length-1; i>=1; i--) {
            int n = food[i]/2;
            System.out.print(n);
            for(int j=0; j<n; j++) {
                sb.append(i);
            }
        }

        //음식을 다 사용 못함
        //food의 값을 모두 2로 나눈 몫을 result 에 붙이고 거기에 + 0 + 뒤에서부터 다시

        //정답의 길이가 3 이상인 경우에만


        return sb.toString();
    }
}