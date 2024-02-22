import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10);
        System.out.println(n + "!");

      int b = 1;
        for (int i = 1; i <= n; i++) {
            b = b*i;
        }
        System.out.println(b);
    }
}