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

        int[] N = new int[a];
        Random random = new Random();

        for (int i = 0; i < N.length; i++) {
            N[i] = random.nextInt(c - b + 1) + b;
        }
        for (int e : N) {
            System.out.print(e + " ");
        }

        int max = 0;
        for (int i = 0; i < N.length; i++)
        if (N[i] > N[max]) {
            max = i;
        }
        System.out.println();
        System.out.println("index: " + max + "; vlue: " + N[max]);
    }
}