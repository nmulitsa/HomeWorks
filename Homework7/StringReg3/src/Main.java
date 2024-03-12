import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class Main {
    public static void main(String[] args) {

        String a = "ab abab abab abababab abea";
        Pattern pattern = compile("[a]+\\w*[ab]+");
        Matcher matcher = pattern.matcher(a);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}