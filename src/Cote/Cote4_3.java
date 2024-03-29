package Cote;

import java.util.Scanner;
//나의 코드
public class Cote4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int user_x = sc.nextInt();
        int user_y = sc.nextInt();
        int user_direction = sc.nextInt();
        int[][] field = new int[M][N];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        boolean[][] visited = new boolean[N][M];
        // 현재 좌표를 방문 처리
        visited[user_x][user_y] = true;
        for (int i = 0; i <field.length ; i++) {
            for (int j = 0; j <field[i].length ; j++) {
                field[i][j] = sc.nextInt();
            }
        }
        int count = 1;//서 있는 곳으로 이동한 것이기 때문에 count = 1
        int turn_time = 0;
        int nx , ny;
        while (true) {
            //왼쪽 돌기
            user_direction = turnLeft(user_direction);
            //왼쪽 방향으로 이동한 좌표
            nx = user_x + dx[user_direction];
            ny = user_y + dy[user_direction];
            //이동한 좌표로 움직일 수 있다면
            if (field[nx][ny] == 0 && visited[nx][ny] == false) {
                user_x = nx;
                user_y = ny;
                count += 1;//이동횟수 증가
                turn_time = 0;//방향 회전 횟수 0으로 초기화
                visited[user_x][user_y] = true;//방문
            } else {
                turn_time++;//회전 횟수 증가
            }
            if (turn_time == 4) {//만약 다시 원점 방향으로 돌아오면
                // 뒷 칸으로 이동한 좌표 설정
                nx = user_x - dx[user_direction];
                ny = user_y - dy[user_direction];
                //뒷 칸으로 이동할 수 없으면(뒷칸이 바다일 경우)
                if (field[nx][ny] == 1) {
                    break;//반복문 탈출
                } else {
                    //이동할 수 있다면 좌표 이동
                    user_x = nx;
                    user_y = ny;
                }
                turn_time = 0;//회전 횟수는 다시 0으로 초기화
            }
        }
        System.out.println(count);
    }
    //왼쪽으로 도는 함수
    private static int turnLeft(int user_direction) {
        user_direction -= 1;
        if(user_direction == -1) user_direction = 3;
        return user_direction;
    }
}
//이코테 코드

/**
import java.util.*;

public class Main {

    public static int n, m, x, y, direction;
    // 방문한 위치를 저장하기 위한 맵을 생성하여 0으로 초기화
    public static int[][] d = new int[50][50];
    // 전체 맵 정보
    public static int[][] arr = new int [50][50];

    // 북, 동, 남, 서 방향 정의
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};

    // 왼쪽으로 회전
    public static void turn_left() {
        direction -= 1;
        if (direction == -1) direction = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력받기
        n = sc.nextInt();
        m = sc.nextInt();

        // 현재 캐릭터의 X 좌표, Y 좌표, 방향을 입력받기
        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();
        d[x][y] = 1; // 현재 좌표 방문 처리

        // 전체 맵 정보를 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 시뮬레이션 시작
        int cnt = 1;
        int turn_time = 0;
        while (true) {
            // 왼쪽으로 회전
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            // 회전한 이후 정면에 가보지 않은 칸이 존재하는 경우 이동
            if (d[nx][ny] == 0 && arr[nx][ny] == 0) {
                d[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            }
            // 회전한 이후 정면에 가보지 않은 칸이 없거나 바다인 경우
            else turn_time += 1;
            // 네 방향 모두 갈 수 없는 경우
            if (turn_time == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];
                // 뒤로 갈 수 있다면 이동하기
                if (arr[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }
                // 뒤가 바다로 막혀있는 경우
                else break;
                turn_time = 0;
            }
        }

        System.out.println(cnt);
    }

}
*/
