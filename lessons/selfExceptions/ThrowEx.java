package lessons.selfExceptions;

import java.io.IOException;

public class ThrowEx {
    public static void main(String[] args) { // в мэйн никогда не пробрасывать!!!
        try{
            doSomething();
        }catch (IOException e){
           e.printStackTrace();
        }
    }

    public static void doSomething() throws IOException {
        throw new IOException();
    }
}
