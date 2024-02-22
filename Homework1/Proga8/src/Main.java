import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        System.out.println("Число А" + " " + "=" + " " + a);
        int b = random.nextInt(100) + 10;
        System.out.println("Число B" + " " + "=" + " " + b);
        int A = a;
        int B = b;

        int N = 0;
        for (int i = B - 1; i > A; i--) {
            N++;
            System.out.print(i + " ");
        }
        { System.out.println();
        }
        System.out.print("Количество чисел" + " " + " " + "=" + " " + N);
    }
}