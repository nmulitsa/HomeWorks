import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = scanner.nextLine();
        Matcher matcher = Pattern.compile("\\w+.com$").matcher(a);

        System.out.println(matcher.matches());
    }
}