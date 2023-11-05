package CodingTest_Study.정훈.Programmers;

import java.util.*;

class Solution_뒤에있는큰수찾기 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for(int i=1; i<numbers.length; i++) {

            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }


        // for(int i=0; i<numbers.length; i++) {
        //     if(i == numbers.length-1) {
        //         answer[i] = -1;
        //         break;
        //     }
        //     for(int j=i+1; j<numbers.length; j++) {
        //         //큰값이 없는 경우 -1
        //         if(numbers[i] > numbers[j]) {
        //             answer[i] = -1;
        //         }
        //         //큰값이 나오면 해당 값으로 바꾸고 break;
        //         else if(numbers[i] < numbers[j]){
        //             answer[i] = numbers[j];
        //             break;
        //         }
        //     }
        // }


        return answer;
    }
}