package CodingTest_Study.정훈.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ_String_14425_문자열집합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        for (int i = 0; i < m; i++) {
            if(list.contains(sc.next())) {
                answer++;
            }
        }

        System.out.println(answer);

    }

}
