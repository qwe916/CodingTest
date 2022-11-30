package programmers;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/87946
 */
public class CodingTest2 {
    static class Solution {
        public int solution(int k, int[][] dungeons) {
            int answer = 0;
            int[] arr = new int[dungeons.length];
            for (int i = 0; i < dungeons.length; i++) {
                boolean[] visited = new boolean[dungeons.length];
                Queue<Integer> q = new ArrayDeque<>();
                q.add(i);
                visited[i] = true;
                while (!q.isEmpty()) {
                    k -= dungeons[i][1];
                    arr[i]++;
                    if (arr[i] == dungeons.length) {
                        return dungeons.length;
                    }
                    for (int j = 0; j <dungeons.length ; j++) {
                        if (k >= dungeons[j][0] && !visited[j]) {
                            q.add(j);
                            visited[j] = true;
                        }
                    }
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        Solution solution = new Solution();
        System.out.println(solution.solution(k,dungeons));
    }
}
