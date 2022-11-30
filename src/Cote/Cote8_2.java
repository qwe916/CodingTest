package Cote;

import java.util.Scanner;

public class Cote8_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x + 1];
        arr[2] = 1;
        arr[3] = 1;
        arr[5] = 1;
        for (int i = 4; i <= x; i++) {
            //점화식 : 전의 숫자 +1 , 나누어진다면 나눈 수의 인덱스 +1 둘 중 더 작은 값
            arr[i] = arr[i - 1] + 1;
            if (i % 5 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 5] + 1);
            } else if (i % 3 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 3] + 1);
            } else if (i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            }
        }
        System.out.println(arr[x]);
    }
}
