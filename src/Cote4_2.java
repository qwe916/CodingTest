import java.util.Arrays;
import java.util.Scanner;
//나의 코드
public class Cote4_2 {
    public static void main(String[] args) {
        int[][] field = new int[8][8];
        Scanner sc = new Scanner(System.in);
        String knight = sc.next();
        int x =0;
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 0; i <alpha.length ; i++) {
            if (knight.charAt(0) == alpha[i]) {
                x = i;
                break;
            }
        }
        int count = 0;
        int y = Integer.parseInt(Character.toString(knight.charAt(1)))-1;
        int[][] move = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};
        for (int i = 0; i < move.length ; i++) {
            if (x + move[i][0] < 0 || x + move[i][0] > 7 || y + move[i][1] < 0 || y + move[i][1] > 7) {
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
//이코테 코드

/**
 * import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 나이트의 위치 입력받기
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' + 1;

        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0;
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치 확인
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }

        System.out.println(result);
    }

}*/
