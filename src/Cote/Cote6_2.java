package Cote;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Cote6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<Integer>() {//아니면 Collections.reverseOrder()
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (Integer t: arr
             ) {
            System.out.print(t+" ");
        }
    }
}
