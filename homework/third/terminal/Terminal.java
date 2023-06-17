package homework.third.terminal;

import homework.third.Person;
import homework.third.exceptions.WrongInput;
import homework.third.workWithFiles.FileCreater;

import java.util.Scanner;

public class Terminal {
    private Parser parser;
    private Person person;

    public void enterData() {
        Menu.menu();
        String data = new Scanner(System.in).nextLine();
        parser = new Parser(data);

        if (parser.countParams() == -1) {
            throw new WrongInput("Неправильное количество параметров");
        } else {
            parser.parseLine();
        }
    }

    public void createPerson() {
        if (parser.isReady()) {
            person = new Person(parser.getName(), parser.getGender(), parser.getNumber(), parser.getBirthday(),
                    parser.fileName);
            FileCreater newFile = new FileCreater(person);
            newFile.create();
        }
    }
}
