import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите размер массива");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("Отрицательное число. Перезапустите программу.");
            return;
        }
        System.out.println("Ведите нижний диапазон массива: ");
        int b = scanner.nextInt();
        System.out.println("Ведите верхний диапазон массива: ");
        int c = scanner.nextInt();
        if (b > c) {
            System.out.println("Нижний диапазон больше верхнего. Перезапустите программу.");
            return;
        }
        System.out.println();

        int[] rnd = new int[a];
        Random random = new Random();

        for (int i = 0; i < rnd.length; i++) {
            rnd[i] = random.nextInt(c - b + 1) + b;
        }
        for (int e : rnd) {
            System.out.print(e + " ");
        }

    }
}