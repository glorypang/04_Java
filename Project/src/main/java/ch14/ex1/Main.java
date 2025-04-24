package ch14.ex1;

import java.util.Scanner;

public class Main {
    public static int count = 0; // 현재 숫자
    public static int finalNumber = 0; // 마지막 숫자
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("참가할 인원 수: ");
        finalNumber = sc.nextInt();

        for (int i = 0; i < finalNumber; i++) {
            new Thread(new Player("플레이어" + i)).start();
        }

    }
}
