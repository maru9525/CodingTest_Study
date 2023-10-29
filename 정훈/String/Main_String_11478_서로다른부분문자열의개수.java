package CodingTest_Study.정훈.String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_String_11478_서로다른부분문자열의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //연속되는 문자열 갯수
        //5+4+3+2+1 중복 제거
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                set.add(str.substring(i,j));
            }
        }

        System.out.println(set.size());
    }
}
