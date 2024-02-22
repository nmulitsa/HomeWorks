import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную n");
        int n = scanner.nextInt();

        if(n%2 == 0) {
            System.out.println("n" + " - " + " " + "четное число");
        } else {
            System.out.println("n" + " - " + " " +  "нечетное число");
        }
    }
}