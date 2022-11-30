package programmers;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/138476?language=java
 */
public class CodingTest1 {
    static class Solution {
        public int solution(int k, int[] tangerine) {
            int answer = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < tangerine.length; i++) {
                if (map.containsKey(tangerine[i])) {
                    map.put(tangerine[i], map.get(tangerine[i]) + 1);
                } else {
                    map.put(tangerine[i], 1);
                }
            }
            ArrayList<Integer> list = new ArrayList<>(map.values());
            list.sort((o1, o2) -> o2.compareTo(o1));
            for (Integer value : list
            ) {
                if (k - value <= 0) {
                    answer++;
                    break;
                } else {
                    k -=value;
                    answer++;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.solution(k, tangerine));
    }
}
