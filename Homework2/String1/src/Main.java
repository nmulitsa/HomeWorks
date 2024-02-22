import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Ведите символ");
        String ch = scanner.nextLine();

        int count = 0;
        char b = ch.charAt(0);
        char[] array = str.toCharArray();
        for (char i : array) {
            if (i == b) {
                count++;
            }
        }
            System.out.println(count);
        }
    }