package homework.second;

import java.util.Scanner;

public class FloatInput {

    public static void main(String[] args) {
        System.out.println(enterNumber());
    }

    public static float enterNumber() {
        while (true) {
            String number = new Scanner(System.in).nextLine();
            if (number.length() != 0) {
                if (number.matches("^([+-]?\\d*\\.?\\d*)$")) {
                    return Float.parseFloat(number);
                } else if (number.matches("\\w+\\.?")) {
                    System.out.println("Некорректный ввод, введите заново: ");
                }
            } else System.out.println("Пустая строка, повторите ввод: ");
        }
    }
}
