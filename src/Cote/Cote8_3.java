package Cote;

import java.util.Scanner;

public class Cote8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] store = new int[n];
        for (int i = 0; i <n ; i++) {
            store[i] = sc.nextInt();
        }
        for (int i = 2; i <n ; i++) {
            store[i] = Math.max(store[i - 1], store[i - 2] + store[i]);
        }
        System.out.println(Math.max(store[n - 1], store[n - 2]));
    }
}
/**
 * 이코테 코드
 * 차이점 : 나는 dp 배열을 따로 생성하지 않고 그대로 store 배열을 사용하였지만
 * dp배열을 생성해서 저장하는게 좋아 보인다..
 * 또한 첫 번째와 두번쨰 식량 창고는 그냥 입력 받은 걸로 저장하려고 생각했지만 두번째 창고는 첫번째 창고가 두번째 창고 양보다 크면 첫번째 창고의 양으로 저장해야 했다.
 *
public class Main {

    // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
    public static int[] d = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 N을 입력받기
        int n = sc.nextInt();

        // 모든 식량 정보 입력받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }

        // 계산된 결과 출력
        System.out.println(d[n - 1]);
    }
}

*/
