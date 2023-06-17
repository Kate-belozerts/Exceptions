package lessons;

public class nullFinder {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, null, 6, 9, null, 1, null};
        try {
            checkArray(array);
        }catch (RuntimeException e){
            e.getStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void checkArray(Integer[] arr){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                result.append(" ").append(i);
            }
        }
        if (result.length() > 0) throw new RuntimeException("В ячейках " + result + " значения null !!!");
        else System.out.println("Good");
    }
}
