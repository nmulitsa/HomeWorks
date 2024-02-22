import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(20) +10;
        System.out.println("количесвто строк" + " " +  a);

       int b = 1;
        while (b <= a) {
            System.out.println("Task" + " " + b++);
        }
    }
}