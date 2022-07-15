import java.util.Scanner;

public class Cote8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bottom = new int[n];
        bottom[0] = 1;
        bottom[1] = 3;
        for (int i = 2; i <n ; i++) {
            bottom[i] = (bottom[i - 1] + bottom[i - 2] * 2) % 796796;
        }
        System.out.println(bottom[n - 1]);
    }
}
