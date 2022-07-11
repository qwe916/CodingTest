
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cote5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] field = new int[N][M];
        for (int i = 0; i <N ; i++) {
            String[] s = sc.next().split("");
            for (int j = 0; j <s.length ; j++) {
                field[i][j] = Integer.parseInt(s[j]);
            }
        }
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int x = 0;
        int y = 0;
        //큐 생성
        Queue<Node> queue = new LinkedList<>();
        //큐에 0,0 노드 삽입
        queue.offer(new Node(x,y));
        //큐가 빌때까지
        while (!queue.isEmpty()) {
            //큐에서 값 꺼내기
            Node node = queue.poll();
            //x,y좌표 설정
            x = node.getX();
            y = node.getY();
            //상하좌우 탐색
            for (int i = 0; i <4 ; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                //범위를 벗어날 경우 다른 방향으로
                if (nx < 0 || ny < 0 || nx > N - 1 || ny > M - 1) {
                    continue;
                }
                //만약 괴물이 있는 곳이면 다른 방향으로
                if (field[nx][ny] == 0) {
                    continue;
                }
                //해당 좌표로 갈 수 있다면
                if (field[nx][ny] == 1) {
                    //해당좌표값에 전의 좌표+1로 초기화
                    field[nx][ny] = field[x][y] + 1;
                    //큐에 해당 좌표 노드 삽입
                    queue.offer(new Node(nx, ny));
                }
            }
        }
        //최종 거리
        System.out.println(field[N-1][M-1]);
    }
}
//큐에 넣을 노드 클래스 생성
class Node {

    private int x;
    private int y;
    //생성자
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //getter
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
