package lessons;

import java.util.Scanner;

public class NumberExceptions {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 8, 4, 7};
        while (true) checkError(returnIndex(arr, chat()));
    }

    public static int chat(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
    public static int returnIndex(int[] arr, int i){
        if (arr == null) return -3;
        if (arr.length < 2) return -1;
        if (i > 999999990) return -77;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) return j;
        }
        return -2;
    }

    public static void checkError(int num){
        if (num >= 0) System.out.println("Элемент найден на позиции: " + num);
        if (num == -1) System.out.println("Длина массива слишком мала");
        if (num == -2) System.out.println("Элемент не найден");
        if (num == -3) System.out.println("Пустой массив");
        if (num == -77) System.out.println("Слишком большое число");
    }
}
