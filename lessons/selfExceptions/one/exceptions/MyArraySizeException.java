package lessons.selfExceptions.one.exceptions;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        this("Неверный размер массива");
    }
    public MyArraySizeException(String message){
        super(message);
    }
}
