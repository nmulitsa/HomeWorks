import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО через пробел:");
        String fio = scanner.nextLine();
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        try {
            if (age > 100 || age <= 0) {
                throw new IncorrectInfoException(fio + age + " некорректеый возраст");
            }
        } catch (IncorrectInfoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        Pattern pattern = compile("\\W+|[a-zA-z\\s]{201,}$");
        Matcher matcher = pattern.matcher(fio);
        matcher.matches();
        try {
            if (matcher.find()) {
                throw new IncorrectInfoException("Некорректеные данные: " + fio);
            }
        } catch (IncorrectInfoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}