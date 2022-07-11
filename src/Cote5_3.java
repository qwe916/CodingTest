import java.util.Scanner;
//이코테 코드
public class Cote5_3 {
    static char[][] ice;
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        ice = new char[N][M];
        for (int i = 0; i <N ; i++) {
            char[] temp = sc.next().toCharArray();
            ice[i] = temp;
        }
        int count = 0;
        for (int i = 0; i <ice.length ; i++) {
            for (int j = 0; j < ice[i].length; j++) {
                if (dfs(i, j)) { //얼음을 만들 수 있으면 count 증가
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }

    static boolean dfs(int y, int x) {
        //범위가 벗어났을 경우 false 반환
        if (y < 0 || x < 0 || y > N - 1 || x > M - 1) {
            return false;
        }
        //만약 방문한적이 없으면
        if (ice[y][x] == '0') {
            ice[y][x] = '1';//방문 처리
            //상하좌우 탐색
            dfs(y - 1, x);
            dfs(y + 1, x);
            dfs(y, x - 1);
            dfs(y, x + 1);
            //탐색 완료시 true 반환
            return true;
        }
        //방문한적(혹은 닫혀있는곳)이 있으면 false반환
        return false;
   }
}
