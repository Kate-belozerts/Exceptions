package lessons;

import java.io.IOException;

public class TryResources {
    public static void main(String[] args) {
        try(Counter counter = new Counter()){
            counter.add();
            counter.add();
            System.out.println("Считаю");
            System.out.println(counter.getCount());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("конец блока try-catch");
    }
}
