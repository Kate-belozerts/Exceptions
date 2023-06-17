package lessons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileMaker {
    public static void main(String[] args) throws IOException {
        reader("lessons/file.txt");
    }

    public static void reader(String name) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(name));
        try {
            StringBuilder temp = new StringBuilder();
            String line = bufferedReader.readLine();

            while (line != null) {
                line = check(line);
                temp.append(line);
                temp.append(System.lineSeparator());
                line = bufferedReader.readLine();
            }
            try (FileWriter writer = new FileWriter(name)) {
                writer.write(temp.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            bufferedReader.close();
        }
    }


    static String check(String line) {
        String[] string = line.split("=");
        char[] chars = string[1].toCharArray();

        for (char aChar : chars) {
            if (!(Character.isDigit(aChar) || aChar == '?')) {
                throw new RuntimeException("некорректная запись"); // <- выкинуть ошибку, если не число и не вопросик
            }
            if (line.contains("?")) {
                string[1] = String.valueOf(string[0].length());
            }

        }
        return string[0] + "=" + string[1];
    }
}
