package CodingTest_Study.정훈.Programmers;

import java.util.*;
class Solution_대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        //할당된 문자들이 담긴 keymap
        //문자열 배열
        // int[] num = new int[26]; //알파벳들의 위치를 담기 위한 배열
        // for(int i=0; i<26; i++) {
        //     num[i] = 99999;
        // }
        // //작성할 수 없으면 -1
        // //target을 만들때 최소 몇번을 눌러야하는지
        // //keymap을 보고 두개중 최소값을 해당 위치에 숫자로 나타낸다
        // for(int i=0; i<keymap.length; i++) {
        //     for(int j=0; j<keymap[i].length(); j++) {
        //         int key = keymap[i].charAt(j) - 'A';
        //         // System.out.print(key);
        //         int min = Math.min(j+1, num[key]);
        //         num[key] = min;
        //     }
        // }
        // // for(int a: num) System.out.println(a+ " ");
        // int[] result = new int[targets.length];
        // for(int i=0; i<targets.length; i++) {
        //     int tsum = 0;
        //     for(int j=0; j<targets[i].length(); j++) {
        //         int tkey = targets[i].charAt(j) - 'A';
        //         tsum += num[tkey];
        //     }
        //     if(tsum == 0 || tsum == 99999) {
        //         result[i] = -1;
        //     }else {
        //         result[i] = tsum;
        //     }
        // }
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<keymap.length; i++) {
            for(int j=0; j<keymap[i].length(); j++) {
                if(map.containsKey(keymap[i].charAt(j))) {
                    Integer nCurrCnt = map.get(keymap[i].charAt(j));
                    if(nCurrCnt > (j+1)) {
                        map.put(keymap[i].charAt(j), j+1);
                    }
                }else {
                    map.put(keymap[i].charAt(j), j+1);
                }
            }
        }

        for(int i=0; i<targets.length; i++) {
            int nCnt = 0;
            for(int j=0; j<targets[i].length(); j++) {
                Integer nClick = map.get(targets[i].charAt(j));
                if(nClick != null) {
                    nCnt += nClick;
                }else {
                    nCnt = -1;
                    break;
                }
            }
            result[i] = nCnt;
        }

        return result;
    }
}