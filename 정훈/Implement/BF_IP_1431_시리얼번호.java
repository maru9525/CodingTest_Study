package CodingTest_Study.정훈.Implement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BF_IP_1431_시리얼번호 {
    static int n;
    static String[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            arr[i] = str;
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                }else if(o1.length() == o1.length()) {
                    if(sum(o1) == sum(o2)) {
                        return o1.compareTo(o2);
                    }else {
                        return Integer.compare(sum(o1), sum(o2));
                    }
                }else {
                    return 1;
                }
            }
        });
        for(String temp : arr) {
            System.out.println(temp);
        }

    }

    private static int sum(String o1) {
        int s = 0;
        for (int i = 0; i < o1.length(); i++) {
            if(o1.charAt(i) >= '0' && o1.charAt(i) <= '9') {
                s += o1.charAt(i)-'0';
            }
        }
        return s;
    }
}
