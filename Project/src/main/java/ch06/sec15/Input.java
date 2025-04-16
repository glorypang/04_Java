package ch06.sec15;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static String read(String title) {

        System.out.print(title);
        return scanner.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.print(title + " (" + defaultValue + "): ");
        String input = scanner.nextLine();
        return input.isEmpty() ? defaultValue : input;
    }

    public static int readInt(String title) {
        while (true) {
            System.out.print(title);
            String input = scanner.nextLine();
            return Integer.parseInt(input);
        }
    }

    public static boolean confirm(String title, boolean defaultValue) {
        String option = defaultValue ? "Y/n" : "y/N";
        System.out.print(title + " (" + option + "): ");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.isEmpty()) return defaultValue;
        if (input.equals("y")) return true;
        if (input.equals("n")) return false;

        return confirm(title, defaultValue);
    }

    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}