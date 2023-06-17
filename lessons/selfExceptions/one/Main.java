package lessons.selfExceptions.one;

import lessons.selfExceptions.one.exceptions.MyArrayDataException;
import lessons.selfExceptions.one.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] strings = new String[4][];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = new String[4];
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = String.valueOf(j);
            }
        }

        strings[0][2] = "lkjhgfds";
        strings[1][3] = "ghbjk";
        try {
            System.out.println(sum(strings));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getIndex());
        }
    }

    public static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        checkSize(arr);
        checkData(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = Integer.parseInt(arr[i][j]);
                sum += num;
            }
        }
        return sum;
    }

    private static void checkSize(String[][] arr) throws MyArraySizeException {
        boolean correct = true;
        if (arr.length != 4) {
            correct = false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    correct = false;
                    break;
                }
            }
        }
        if (!correct) throw new MyArraySizeException();
    }

    private static void checkData(String[][] arr) throws MyArrayDataException {
        MyArrayDataException exception = new MyArrayDataException();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!arr[i][j].matches("[0-9]+")) {
                    exception.addIndex(i, j);
                }
            }
        }
        if (exception.work()) throw exception; //заполнили и бросили искл
    }

}
