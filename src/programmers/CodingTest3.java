package programmers;

import java.util.Arrays;
import java.util.Stack;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/133502
 * 햄버거 쌓기
 * 스택을 이용해서 스택의 크기가 4이상이 되면 스택마지막 요소부터 1231을 거꾸로 검사한다.
 * 만약 검사 성공시 pop을 한 후 answer 1증가
 */
public class CodingTest3 {
    static class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < ingredient.length; i++) {
                stack.add(ingredient[i]);
                if (stack.size() >= 4) {
                    if (stack.get(stack.size() - 1) == 1 && stack.get(stack.size() - 2) == 3 && stack.get(stack.size() - 3) == 2 && stack.get(stack.size() - 4) == 1) {
                        stack.pop();
                        stack.pop();
                        stack.pop();
                        stack.pop();
                        answer++;
                    }
                }
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        int[] i = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        Solution solution = new Solution();
        System.out.println(solution.solution(i));
    }
}