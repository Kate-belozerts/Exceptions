package lessons;

public class RunExceptions {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 0, 1}, {10, 1, 1}, {0, 0, 0}};
        try{
            System.out.println(countArray(array));
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(" Доработает до сюда в любом случае) ");
    }

    public static int countArray(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length){
                throw new RuntimeException("Массив не является квадратным");
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1){
                    throw new RuntimeException("Элемент с индексами [" + i + ", " + j + "] " +
                            "не равен 1 или 0");
                }
                sum += arr[i][j];
            }
        }return sum;
    }
}
