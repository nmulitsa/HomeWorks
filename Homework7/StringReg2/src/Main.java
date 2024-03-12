import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

public class Main {
    public static void main(String[] args) {
        String a = "ahb acb aeb aeeb adcb axeb";
        Pattern pattern = compile("[a]\\w[b]");
        Matcher matcher = pattern.matcher(a);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}