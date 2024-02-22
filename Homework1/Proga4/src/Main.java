import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(25)+2000;
        System.out.println(a + " " + "год");

        int b = a % 100;
        int c = a % 400;
        if ((a % 4 == 0) && !((b != 0) && (c == 0))) {
            System.out.println("Количество дней в этом году = 366");
        } else {
            System.out.println("Количество дней в этом году = 365");
        }
    }
}