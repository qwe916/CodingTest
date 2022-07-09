import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//나의 코드
public class Cote3_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            Integer[] array = new Integer[N];
            for (int i = 0; i <N ; i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array, Collections.reverseOrder());//내림차순으로 정렬
            if (array[0] == array[1]) {//제일 큰수와 두번째로 큰 수가 같을 경우
                System.out.println(array[0] * M);//M번 모두 같은 수를 더하는 것이기 때문에 제일 큰수 x M
            } else {//제일 큰수와 두번째로 큰 수가 다를 경우
                int pattern =  M / (K+1);//두번째로 큰 수가 더해질 횟수
                //제일 큰수가 더해질 횟수 = M번 - 두번째 큰수가 더해질 횟수(pattern)
                System.out.println((M-pattern) * array[0]+pattern* array[1]);
            }

        }
        //나는 제일 큰 수와 두번째로 큰 수가 같을 경우를 나누어서 생각했지만 따로 나누어서 쓰지 않아도 조건을 충족한다.
}

/*
이코테 코드
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 입력 받은 수들 정렬하기
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수
        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);
        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (m - cnt) * second; // 두 번째로 큰 수 더하기
        System.out.println(result);
    }
}*/
