package lessons.selfExceptions.one.exceptions;

import java.util.ArrayList;
import java.util.List;

public class MyArrayDataException extends Exception {
    private List<String> index;

    public MyArrayDataException() {
        this("Ошибка данных");
    }

    public MyArrayDataException(String message) {
        super(message);
        index = new ArrayList<>();
    }

    public void addIndex(int x, int y) {
        this.index.add("[" + x + ", " + y + "]");
    }

    public List<String> getIndex() {
        return index;
    }

    public boolean work() {
        return index.size() > 0;
    }
}
