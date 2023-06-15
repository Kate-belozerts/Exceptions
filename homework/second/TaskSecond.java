package homework.second;

public class TaskSecond {
    public static void main(String[] args) {
        task(0, 8);
    }

    static void task(int d, int position) {
        int[] intArray = new int[]{1, 6, 7, 9, 0, 5, 7, 0, 4};

        if (d == 0 || intArray[position] == 0) {
            System.out.println("Деление на ноль невозможно");
        } else {
            double catchedRes1 = (double) intArray[position] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}
