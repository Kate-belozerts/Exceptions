package homework.third;

import homework.third.exceptions.WrongInput;
import homework.third.terminal.Terminal;

public class ExceptionCheck {
    public static void start() {
        Terminal terminal = new Terminal();

        while (true) {
            try {
                terminal.enterData();
                terminal.createPerson();
            } catch (WrongInput e) {
                System.out.println(e.returnError());
            }
        }
    }
}
