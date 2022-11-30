package Cote;

import java.util.Arrays;
import java.util.Scanner;

public class Cote8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money = sc.nextInt();
        int[] moneys = new int[n];
        for (int i = 0; i <n ; i++) {
            moneys[i] = sc.nextInt();
        }
        int[] dp = new int[money+1];
        Arrays.fill(dp, 10001);//만들 수없는 인덱스일경우 10,001이 저장되어 있다.
        dp[0] = 0;
        //화폐 종류별로
        for (int i = 0; i <moneys.length ; i++) {
            //인덱스를 돌면서
            for (int j = moneys[i]; j <dp.length ; j++) {
                if (dp[j - moneys[i]] != 10001) {// 만약 해당인덱스 - 화폐 종류가 100001이 아니라면
                    dp[j] = Math.min(dp[j], dp[j - moneys[i]]+1);//dp[j-money[i]+1 저장
                }
            }
        }
        System.out.println(dp[money] == 10001? -1: dp[money]);

    }
}
