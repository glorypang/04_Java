package ch05.sec14;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCount = 0;
        int[] scores = null;

        while(true) {
            System.out.println("-----------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------");

            System.out.print("선택> ");
            int choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("학생수> ");
                studentCount = sc.nextInt();
                scores = new int[studentCount];
            }
            else if(choice == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = sc.nextInt();
                }
            }
            else if(choice == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "] = " + scores[i]);
                }
            }
            else if(choice == 4) {
                int max = scores[0];
                int sum = 0;
                for (int score : scores) {
                    if (score > max) max = score;
                    sum += score;
                }
                double avg = (double) sum / scores.length;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            }
            else if(choice == 5) {
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("잘못된 선택입니다.");
            }
        }

        sc.close();
    }
}
