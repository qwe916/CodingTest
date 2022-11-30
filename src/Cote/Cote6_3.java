package Cote;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Cote6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] students = new String[n][2];
        for (int i = 0; i <n ; i++) {
            students[i][0] = sc.next();
            students[i][1] = sc.next();
        }
        Arrays.sort(students, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[1])-Integer.parseInt(o2[1]);
            }
        });
        for (String[] s: students
             ) {
            System.out.print(s[0]+" ");
        }
    }
}

//이코테 코드
/**
import java.util.*;

class Student implements Comparable<Student> {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    // 정렬 기준은 '점수가 낮은 순서'
    @Override
    public int compareTo(Student other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();

        // N명의 학생 정보를 입력받아 리스트에 저장
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }

        Collections.sort(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getName() + " ");
        }
    }
}*/
