package homework.first;

import java.util.Arrays;

public class TwoArrays {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(divideArrays(array, array1)));
    }

    public static int[] divideArrays(int[] arr, int[] lst) {
        try {
            return arrays(arr, lst);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static int[] arrays(int[] arr, int[] lst) {
        if (arr == null || lst == null) throw new RuntimeException("Один или оба массива не инициализированы");
        if (arr.length != lst.length) throw new RuntimeException("Размеры массивов не равны");
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || lst[i] == 0) throw new RuntimeException("Нельзя делить на ноль");
            result[i] = arr[i] / lst[i];
        }
        return result;
    }
}
