package homework.second;

import java.util.Scanner;

public class EmptyLine {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        while (true) {
            try {
                enter();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void enter() {
        String line = new Scanner(System.in).nextLine();
        if (line.length() != 0) {
            System.out.println(line);
        } else {
            throw new RuntimeException("Пустую строку вводить нельзя, повторите ввод: ");
        }
    }
}
