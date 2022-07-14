import java.util.Arrays;
import java.util.Scanner;

public class Cote7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] items = new int[n];
        for (int i = 0; i <items.length ; i++) {
            items[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] want = new int[m];
        for (int i = 0; i <want.length ; i++) {
            want[i] = sc.nextInt();
        }
        //정렬이 되어있을 경우에만 이진탐색 가능
        Arrays.sort(items);
        for (int i = 0; i < want.length ; i++) {
            System.out.println(binarySearch(want[i],0,items.length-1,items));
        }
    }
    //이진 탐색
    static boolean binarySearch(int target,int start, int end, int[] array) {
        while (start <= end) {
            int mid = (start+end) / 2;
            if (array[mid] == target) {
                return true;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
