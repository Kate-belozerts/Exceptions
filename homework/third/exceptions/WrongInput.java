package homework.third.exceptions;

public class WrongInput extends RuntimeException {
    private final String line;

    public WrongInput(String line) {
        this.line = line;
    }

    public String returnError() {
        String error = "Неверный ввод ";
        return error + line;
    }
}
