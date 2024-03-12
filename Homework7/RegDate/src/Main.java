import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату");
        String a = scanner.nextLine();
        Matcher matcher = Pattern.compile("(1\\d{3}|200\\d|201[0-2])/(0\\d|1[0-2])/(0\\d|1\\d|2\\d|3[0])(\\s)(0\\d|1\\d|2[0-4]):(0\\d|1\\d|2\\d|3\\d|4\\d|5\\d)").matcher(a);

        matcher.matches();
        if (matcher.matches()==true) {
            System.out.println("Такая дата существует.");
        }
        else {
            System.out.println("Такой даты не существует.");
        }
    }
}