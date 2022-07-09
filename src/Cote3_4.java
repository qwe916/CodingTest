import java.util.Scanner;

//나의 코드
public class Cote3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        while (N != 1) {
            if (N % K == 0) {
                N = N / K;
                count++;
            } else {
                N -= 1;
                count++;
            }
        }
        System.out.println(count);
    }
    //N이 100억 이상의 큰 수가 되는 경우에도 빠르게 동작하기 위해서는 N이 k의 배수가 되도록 효율적으로 한 번에 빼는 방식으로 소스코드를 작성하면 더 효율적이다.
}
/*
* import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1);
        System.out.println(result);
    }

}*/
