package Cote;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cote6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        for (int i = 0; i <k ; i++) {
            if (a[i] >= b[i]) {
                break;
            } else {
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
        }
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
