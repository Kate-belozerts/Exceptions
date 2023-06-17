package homework.third.workWithFiles;

import homework.third.Person;

import java.io.*;

public class FileCreater {
    Person person;
    String filePath;

    public FileCreater(Person person) {
        this.person = person;
        filePath = "homework/third/workWithFiles/files/" + person.getFileName() + ".txt";
    }

    public void create() {
        if (person.getInfoPerson().length() != 0) {

            try (FileWriter writer = new FileWriter(filePath, true)) {
                writer.append(person.getInfoPerson()).append("\n");
                System.out.println(person.getInfoPerson() + "Записано в файл");
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("Ошибка файла");
            }
        } else System.out.println("Недостаточно данных для записи");
    }
}
