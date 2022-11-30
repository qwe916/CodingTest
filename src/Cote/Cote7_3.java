package Cote;

import java.util.Arrays;
import java.util.Scanner;

public class Cote7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ricecake = new int[n];
        for (int i = 0; i <ricecake.length ; i++) {
            ricecake[i] = sc.nextInt();
        }
        System.out.println(HSearch(ricecake, m));
    }
    //0과 제일 길이가 긴 떡의 길이를 start와 end로 잡아 h를 움직이면서 계산하여 남은 떡의 길이들의 총합을 구한다.
    static int HSearch(int[] array,int target) {
        Arrays.sort(array);
        int end = array[array.length - 1];
        int start = 0;
        int result = 0;
        int h = 0;
        while (start <= end) {
            h = (start + end) / 2;//h의 길이는 start와 end 더하기의 반
            result = 0;//총 남은 떡의 길이의 합
            for (int i = 0; i <array.length ; i++) {
                if (array[i] > h) {// 떡의 길이가 h보다 길면
                    result += array[i] - h;//자르고 남은 떡의 길이를 결과에 더하기
                }
            }
            //총 합의 길이가 목표보다 작으면 end를 조정 크면 start를 조정 같으면 반복문 탈출하고 h 반환
            if (result < target) {
                end = h - 1;
            } else if (result > target) {
                start = h + 1;
            } else {
                break;
            }
        }
        return h;
    }
}
