package homework.second;

import java.util.Arrays;

public class TaskThird {
    public static void main(String[] args) {
        Integer a = 90;
        Integer b = 3;
        int[] array = new int[]{1, 2};

        printSum(a, b);
        printDivide(a, b);
        System.out.println(Arrays.toString(fillArray(9, 3, array)));
    }

    public static void printSum(Integer a, Integer b) {
        if (a == null || b == null) {
            System.out.println("Неверно введены данные");
        } else System.out.println(a + b);
    }

    public static void printDivide(Integer a, Integer b) {
        if (a == null || b == null) System.out.println("Пустые переменные");
        else if (a == 0 || b == 0) System.out.println("Делить на ноль нельзя");
        else System.out.println(a / b);
    }

    public static int[] fillArray(int number, int position, int[] arr) {
        int[] result;
        if (arr == null || position > arr.length) {
            result = new int[position + 1];
            if (arr != null) {
                System.arraycopy(arr, 0, result, 0, arr.length);
            }
            result[position] = number;
        } else {
            arr[position] = number;
            return arr;
        }
        return result;
    }

    /// Либо соблюдать иерархию исключений:

//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }
//    }
//
//    public static void printSum(Integer a, Integer b) {
//        System.out.println(a + b);
//    }
}
