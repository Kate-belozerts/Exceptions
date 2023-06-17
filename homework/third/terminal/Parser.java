package homework.third.terminal;

import homework.third.exceptions.WrongInput;

import java.util.HashMap;

public class Parser {
    String input;
    HashMap<String, String> info;
    String fileName;

    public Parser(String input) {
        this.input = input;
    }

    public int countParams() {
        String[] data;
        if (input != null) {
            this.input = input.replaceAll("\\s+", " ");
            data = input.split(" ");
            if (data.length == 6) return 1;
            else return -1;
        } else return -1;
    }

    public boolean isReady() {
        return info.size() == 6;
    }

    public void parseLine() {
        info = new HashMap<>();

        String[] arr = input.split(" ");
        for (String param : arr) {
            if (param.length() == 1) {
                sex(param);
            }
            if (param.contains(".")) {
                birth(param);
            }
            if (param.matches("[a-zA-z]*") ||
                    param.matches("[а-яёА-ЯЁ]+")) {
                name(param);
            } else if (param.matches("\\d+")) {
                number(param);
            }
        }
        if (!info.containsKey("sex") || !info.containsKey("birthday") || !info.containsKey("name1") ||
                !info.containsKey("name2") || !info.containsKey("name3") || !info.containsKey("number"))
            throw new WrongInput("! Более вероятно наличие посторонних символов в имени или номере! " +
                    " Будьте внимательны при вводе!");
    }

    private void sex(String letter) {
        if (letter.equals("f") || letter.equals("m")) {
            if (letter.equals("f")) info.put("sex", "female");
            if (letter.equals("m")) info.put("sex", "male");
        } else throw new WrongInput("параметра - пол. f - женский, m - мужской");
    }

    private void birth(String date) {
        String[] birth = date.replace(".", "-").split("-");
        int day = 0;
        int month = 0;
        int year = 0;

        for (String s : birth) {
            if (s.matches("\\d+")) {
                int data = Integer.parseInt(s);
                if (day == 0 && data > 0 && data <= 31) day = data;
                else if (data > 1900) year = data;
                else if (month == 0 && data > 0 && data <= 12) month = data;
            } else throw new WrongInput("неправильный формат в дате рождения " + s);
        }
        if (day != 0 && month != 0 && year != 0) {
            if (year > 2023) {
                throw new WrongInput("даты рождения! Вы из будущего? ");
            }
            String res = day + "." + month + "." + year;
            info.put("birthday", res);
        } else {
            throw new WrongInput("даты рождения ");
        }
    }

    private void name(String name) {
        if (name.length() > 1) {
            if (!name.equals(info.get("name2")) && !name.equals(info.get("name3"))) info.putIfAbsent("name1", name);
            if (!name.equals(info.get("name1")) && !name.equals(info.get("name3"))) info.putIfAbsent("name2", name);
            if (!name.equals(info.get("name1")) && !name.equals(info.get("name2"))) info.putIfAbsent("name3", name);
        }
        this.fileName = info.get("name1");
    }

    private void number(String num) {
        char[] chars = num.toCharArray();

        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new WrongInput("номера телефона. Нужны только цифры");
            } else info.put("number", num);
        }
    }

    public String getName() {
        return info.get("name1") + "><" + info.get("name2") + "><" + info.get("name3");
    }

    public String getBirthday() {
        return info.get("birthday");
    }

    public String getNumber() {
        return info.get("number");
    }

    public String getGender() {
        return info.get("sex");
    }
}
