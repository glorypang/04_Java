package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("x 값 입력: ");
        String str = sc.nextLine();
        int x = Integer.parseInt(str);

        System.out.print("y 값 입력: ");
        str = sc.nextLine();
        int y = Integer.parseInt(str);

        int res = x+y;
        System.out.println("X + Y = " + res);

    }
}
