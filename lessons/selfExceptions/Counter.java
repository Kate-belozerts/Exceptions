package lessons.selfExceptions;

import java.io.IOException;

public class Counter implements AutoCloseable{ // ресурс, который можно использовать в try-catch
    private int count;
    private boolean closed;

    //можно без конструктора, тк он бессмысленный. Будет по умолчанию

    public void add() throws IOException{ // пробрасывается из checkIfClosed
        checkIfClosed();
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close(){ // удалили проброс. Если нужно прописать логику, то тут не ясен контекст, соотв. можно пробросить
        //по стеку выше и написать логику там
        closed = true;
        System.out.println("ресурс закрыт в методе close");
    }

    private void checkIfClosed() throws IOException{
        if(closed){
            throw new IOException("Ресурс закрыт");
        }
    }
}
