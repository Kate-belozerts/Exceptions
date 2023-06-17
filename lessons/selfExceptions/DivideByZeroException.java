package lessons.selfExceptions;

public class DivideByZeroException extends Exception {
    private final String ERROR_MESSAGE = "Divided by zero";

//    public DivideByZeroException() { // Со throwable не работает. Одно из двух
//        this.getMessage();
//    }

    public String getMessage(){
        return ERROR_MESSAGE;
    }

    public DivideByZeroException(Throwable cause){ // класс - родитель и для error и для exception
        // чтобы поместить свой эесепшн в пойманном родным эксепшном, от которого наследовался наш
        // в блоке Caused by будет указано, что наше исключение появилось в следствие другого исключения, от кот. наследовалось наше
        super(cause);
    }
}
