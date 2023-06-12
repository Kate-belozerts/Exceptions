package homework.first;

import java.util.List;


public class ThreeMethods {
    public static void main(String[] args) {
        arrayEmpty(new int[]{}); // ArrayIndexOutOfBoundsException
        accerman(4, 4); // StackOverflowError
        creteNullException(); // NullPointerException
    }

    public static long accerman(long m, long n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return accerman(m - 1, 1);
        } else {
            return accerman(m - 1, accerman(m, n - 1));
        }
    }

    public static void arrayEmpty(int[] arr) {
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void creteNullException() {
        List<Integer> list = null;
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
