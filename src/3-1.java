//나의 코드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        int[][] cards = new int[N][M];
        int max = 0;
        for (int i = 0; i < N; i++) {
            String[] s = bf.readLine().split(" ");
            int cards_min = Integer.parseInt(s[0]);
            for (int j = 0; j <M ; j++) {
                cards[i][j] = Integer.parseInt(s[j]);
                if (Integer.parseInt(s[j]) < cards_min) {
                    cards_min = Integer.parseInt(s[j]);
                }
            }
            if (max < cards_min) {
                max = cards_min;
            }
        }
        System.out.println(max);
    }
}

/*
이코테 코드

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        // 한 줄씩 입력 받아 확인하기
        for (int i = 0; i < n; i++) {
            // 현재 줄에서 '가장 작은 수' 찾기
            int min_value = 10001;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            // '가장 작은 수'들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value);
        }

        System.out.println(result); // 최종 답안 출력
    }

}
}*/
