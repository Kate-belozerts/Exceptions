package homework.third;

public class Person {
    private final String FIO;
    private final String sex;
    private final String number;
    private final String birthday;
    private final String fileName;

    public Person(String FIO, String sex, String number, String birthday, String fileName) {
        this.FIO = FIO;
        this.sex = sex;
        this.number = number;
        this.birthday = birthday;
        this.fileName = fileName;
    }

    public String getInfoPerson() {
        return "<" + this.FIO + ">" + "<" + this.birthday + ">" + "<" + this.number + ">" + "<" + this.sex + ">";
    }

    public String getFileName() {
        return fileName;
    }
}
